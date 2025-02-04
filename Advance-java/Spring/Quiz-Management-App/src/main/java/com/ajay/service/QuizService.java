package com.ajay.service;

import com.ajay.model.Question;

import java.util.List;

public interface QuizService {
    List<Question> getAllQuestions();
    int calculateScore(List<String> answers);
}


