package com.example.psp.communication;

import java.util.List;
import java.util.Random;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Communication;


@Service
public class CommunicationService
{
	
	
	@Autowired
	CommunicationRepository repo;
	
	
	
	//Read 15 question from database and show to the rest end points
	public List<Communication> getQuestions()
	{
	    List<Communication> list = repo.findAll();
     	
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
	public void storeQuestions(List<Communication> list)
	{
		repo.saveAll(list);
	}


	public List<Communication> getAllQuestions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public void deleteQuestions() {
		// TODO Auto-generated method stub
		repo.deleteById(0);
		repo.deleteAll();
	}
}
