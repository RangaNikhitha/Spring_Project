package com.project.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quizapp.model.Question;
import com.project.quizapp.repository.QuestionDao;

@RestController
@RequestMapping("Question")
public class QuestionController {
	
	@Autowired
	QuestionDao questionDao;
	@GetMapping("/allQuestions")
	public List<Question> getAllQuestions(){
		return questionDao.findAll();
		
	}

}
