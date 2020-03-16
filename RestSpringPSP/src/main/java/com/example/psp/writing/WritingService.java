package com.example.psp.writing;

import java.util.List;
import java.util.Random;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Writing;


@Service
public class WritingService
{
	
	
	@Autowired
	WritingRepository repo;
	
	
	
	//Read 15 question from database and show to the rest end points
	public List<Writing> getQuestions()
	{
	    List<Writing> list = repo.findAll();
     	
     	Random no = new Random();
     	
     	int no1 = list.size();
     	
     	while(no1 >= 16)
     	{
     		
     		list.remove(no.nextInt(15));
     		no1--;
     	}
     	System.out.println(no1);
		return list;
	     	
	}
	
	
	//Store question to the database
	public void storeQuestions(List<Writing> list)
	{
		repo.saveAll(list);
	}


	public List<Writing> getAllQuestions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
