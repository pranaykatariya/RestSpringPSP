package com.example.psp.question;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.psp.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
