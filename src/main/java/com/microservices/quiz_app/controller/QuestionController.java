package com.microservices.quiz_app.controller;

import com.microservices.quiz_app.entities.Question;
import com.microservices.quiz_app.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<?> getAllQuestions(){
        List<Question> allQuestions = questionService.getAllQuestions();
        return new ResponseEntity<>(allQuestions ,HttpStatus.OK);
    }
}
