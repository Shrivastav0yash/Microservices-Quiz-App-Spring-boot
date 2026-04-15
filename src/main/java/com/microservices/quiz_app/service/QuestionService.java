package com.microservices.quiz_app.service;

import com.microservices.quiz_app.entities.Question;
import com.microservices.quiz_app.repository.QuestionsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionsRepo questionsRepo;

    public List<Question> getAllQuestions(){
        return questionsRepo.findAll();
    }
}
