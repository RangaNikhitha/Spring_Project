package com.project.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizapp.model.Question;

public interface QuestionDao extends JpaRepository<Question,Integer> {

}
