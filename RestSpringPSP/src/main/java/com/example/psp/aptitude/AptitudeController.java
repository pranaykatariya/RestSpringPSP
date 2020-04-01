package com.example.psp.aptitude;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Aptitude;

@RestController
public class AptitudeController 
{
	@Autowired
	AptitudeService AptitudeService;
	
	@GetMapping("getAptitudeQuestions")
	public List<Aptitude> getQuestions()
	{
		return AptitudeService.getQuestions();	
	}
	
	
	@GetMapping("getAllAptitudeQuestions")
	public List<Aptitude> getAllQuestions()
	{
		return AptitudeService.getAllQuestions();
	}
	
	
	@PostMapping("storeAptitudeQuestions")
	public void storeQuestions(@RequestBody List<Aptitude> list)
	{
		AptitudeService.storeQuestions(list);
	}
}