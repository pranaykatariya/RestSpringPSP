package com.example.psp.technical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.psp.model.Response;
import com.example.psp.model.Technical;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TechnicalController 
{
	@Autowired
	TechnicalService technicalService;
	
	@GetMapping("getTechnicalQuestions")
	public List<Technical> getQuestions()
	{
		return technicalService.getQuestions();	
	}	
	
	
	@GetMapping("getAllTechnicalQuestions")
	public List<Technical> getAllQuestions()
	{
		return technicalService.getAllQuestions();
	}
	
	
	@PostMapping("storeTechnnicalMarks")
	public void storeQuestions(@RequestBody List<Response> list)
	{
		System.out.println("calculating marks");
		technicalService.calculateMarks(list);
		//System.out.println(list.get(0).getCorrectOption());
		//technicalService.storeQuestions(list);
	}
	
	@PostMapping("storeTechnicalQuestions")
	public void storeTechnicalQuestions(@RequestBody List<Technical> list)
	{
		technicalService.storeTechnicalQuestions(list);
	}
}