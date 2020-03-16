package com.example.psp.writing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Writing;

@RestController
public class WritingController 
{
	@Autowired
	WritingService WritingService;
	
	@GetMapping("getWritingQuestions")
	public List<Writing> getQuestions()
	{
		return WritingService.getQuestions();	
	}
	
	
	@GetMapping("getAllWritingQuestions")
	public List<Writing> getAllQuestions()
	{
		return WritingService.getAllQuestions();
	}
	
	
	@PostMapping("storeWritingQuestions")
	public void storeQuestions(List<Writing> list)
	{
		WritingService.storeQuestions(list);
	}
}