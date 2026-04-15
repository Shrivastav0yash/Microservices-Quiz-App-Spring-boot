package com.microservices.quiz_app.repository;

import com.microservices.quiz_app.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepo extends JpaRepository<Question, Long> {
}
