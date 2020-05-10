package com.example.psp.writing;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Writing;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.psp.model.Response;
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	
	
	@PostMapping("storeWritingMarks")
	public String storeWritingMarks(@RequestBody String str)
	{
		System.out.println("calculating marks");
		System.out.println(str);
		String question="", answer="", email="";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootNode = objectMapper.readTree(str);

			email = rootNode.path("email").asText();
			question = rootNode.path("question").asText();
			answer=  rootNode.path("answer").asText();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(question);
		System.out.println(answer);
		System.out.println(email);
		WritingService.calculateMarks(email,question, answer);
		return str;
		
	}
	
	
	@PostMapping("storeWritingQuestions")
	public void storeQuestions(List<Writing> list)
	{
		WritingService.storeQuestions(list);
	}
}