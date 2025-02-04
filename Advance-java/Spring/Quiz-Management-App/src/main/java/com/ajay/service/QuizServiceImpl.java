package com.ajay.service;

import com.ajay.dao.QuizDAO;
import com.ajay.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizDAO quizDAO;

    @Override
    public List<Question> getAllQuestions() {
        return quizDAO.fetchAllQuestions();
    }

    @Override
    public int calculateScore(List<String> answers) {
        List<Question> questions = quizDAO.fetchAllQuestions();
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (i < answers.size() && questions.get(i).getCorrectAnswer().equals(answers.get(i))) {
                score++;
            }
        }
        return score;
    }
}
