package com.example.psp.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Presentation;

@RestController
public class PresentationController 
{
	@Autowired
	PresentationService PresentationService;
	
	@GetMapping("getPresentationQuestions")
	public List<Presentation> getQuestions()
	{
		return PresentationService.getQuestions();	
	}
	
	
	@GetMapping("getAllPresentationQuestions")
	public List<Presentation> getAllQuestions()
	{
		return PresentationService.getAllQuestions();
	}
	
	
	@PostMapping("storePresentationQuestions")
	public void storeQuestions(List<Presentation> list)
	{
		PresentationService.storeQuestions(list);
	}
}