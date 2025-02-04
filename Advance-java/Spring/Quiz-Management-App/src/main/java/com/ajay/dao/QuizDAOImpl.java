package com.ajay.dao;

import com.ajay.model.Question;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

@Repository
public class QuizDAOImpl implements QuizDAO {

    private final DataSource dataSource;

    public QuizDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Question> fetchAllQuestions() {
        List<Question> questions = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM questions");
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                List<String> options = new ArrayList<>();
                options.add(rs.getString("option1"));
                options.add(rs.getString("option2"));

                Question question = new Question(
                        rs.getInt("id"),
                        rs.getString("question_text"),
                        options,
                        rs.getString("correct_answer")
                );
                questions.add(question);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
