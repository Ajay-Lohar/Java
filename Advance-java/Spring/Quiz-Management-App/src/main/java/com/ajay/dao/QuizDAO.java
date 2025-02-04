// QuizDAO.java
package com.ajay.dao;

import com.ajay.model.Question;
import java.util.List;

public interface QuizDAO {
    List<Question> fetchAllQuestions();
}