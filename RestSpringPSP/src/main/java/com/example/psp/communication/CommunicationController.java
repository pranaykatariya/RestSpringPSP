package com.example.psp.communication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Communication;

@RestController
public class CommunicationController 
{
	@Autowired
	CommunicationService CommunicationService;
	
	@GetMapping("getCommunicationQuestions")
	public List<Communication> getQuestions()
	{
		return CommunicationService.getQuestions();	
	}
	
	
	@GetMapping("getAllCommunicationQuestions")
	public List<Communication> getAllQuestions()
	{
		return CommunicationService.getAllQuestions();
	}
	
	
	@PostMapping("storeCommunicationQuestions")
	public void storeQuestions(@RequestBody List<Communication> list)
	{
		CommunicationService.storeQuestions(list);
	}
}