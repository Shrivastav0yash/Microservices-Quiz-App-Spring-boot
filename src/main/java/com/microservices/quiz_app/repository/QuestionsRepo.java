package com.microservices.quiz_app.repository;

import com.microservices.quiz_app.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepo extends JpaRepository<Question, Long> {
    List<Question> findByCategory(String category);
}
