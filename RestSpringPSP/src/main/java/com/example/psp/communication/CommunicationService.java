package com.example.psp.communication;

import java.util.List;
import java.util.Random;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Communication;
import com.example.psp.model.Response;
import com.example.psp.student.StudentService;


@Service
public class CommunicationService
{
	
	
	@Autowired
	CommunicationRepository repo;
	
	@Autowired
	StudentService studentService;
	
	
	
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
		repo.deleteAll();
	}
	
	
	public void calculateMarks(List<Response> list)
	{
		for(Response r: list)
		{
			System.out.println(r.getCheckedOption()+ " "+ r.getCorrectOption());
		}
		
		int mark = 0;
		
		try 
		{
			for(int i=0; i < list.size(); i++)
			{
				//System.out.println(list.get(i).getCheckedOption() + " " + list.get(i).getCorrectOption());
				if((Integer.parseInt(list.get(i).getCheckedOption())) == (((int) list.get(i).getCorrectOption().charAt(0)) - 96))
				{
					mark+= 1;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured in communication service");
		}
		System.out.println("Communication Marks: "+mark);
		System.out.println(list.get(0).getEmail());
		studentService.saveCommunicationMarks( list.get(0).getEmail() , mark);
		
		
		
	}
	
}
