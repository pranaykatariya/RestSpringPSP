package com.example.psp.communication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Communication;
import com.example.psp.model.Response;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	
	@PostMapping("storeCommunicationMarks")
	public void storeCommunicationMarks(@RequestBody List<Response> list)
	{
		System.out.println("calculating marks");
		CommunicationService.calculateMarks(list);
		//System.out.println(list.get(0).getCorrectOption());
		//technicalService.storeQuestions(list);
	}
	
	
	@PostMapping("storeCommunicationQuestions")
	public void storeQuestions(@RequestBody List<Communication> list)
	{ 
		System.out.println();
		CommunicationService.storeQuestions(list);
	}
	
	@GetMapping("deleteCommunicationQuestions")
	public void deleteQuestions()
	{
		CommunicationService.deleteQuestions();
	}
	
}