package com.example.psp.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Question;

@RestController
public class QuestionController 
{
	@Autowired
	QuestionService QuestionService;
	
	@GetMapping("getQuestionQuestions")
	public List<Question> getQuestions()
	{
		return QuestionService.getQuestions();	
	}
	
	
	@GetMapping("getAllQuestionQuestions")
	public List<Question> getAllQuestions()
	{
		return QuestionService.getAllQuestions();
	}
	
	
	@PostMapping("storeQuestionQuestions")
	public void storeQuestions(List<Question> list)
	{
		QuestionService.storeQuestions(list);
	}
}