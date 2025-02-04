// QuizAppController.java
package com.ajay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ajay.service.QuizService;
import com.ajay.model.Question;
import java.util.List;

@Controller
public class QuizAppController {

     @Autowired
     private QuizService quizService;

     @GetMapping("/quiz")
     public String getQuizPage(Model model) {
          List<Question> questions = quizService.getAllQuestions();
          model.addAttribute("questions", questions);
          return "quiz";
     }

     @PostMapping("/quiz/submit")
     public String submitQuiz(@RequestParam("answers") List<String> answers, Model model) {
          int score = quizService.calculateScore(answers);
          model.addAttribute("score", score);
          return "result";
     }
}
