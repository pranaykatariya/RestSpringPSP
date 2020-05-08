package com.example.psp.technical;


import java.util.List;
import java.util.Random;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Aptitude;
import com.example.psp.model.Response;
import com.example.psp.model.Technical;
import com.example.psp.student.StudentService;


@Service
public class TechnicalService
{
	@Autowired
	TechnicalRepository repo;
	
	@Autowired
	StudentService studentService;
	
	
	
		
	//Read 15 question from database and show to the rest end points
	public List<Technical> getQuestions()
	{
		
	    List<Technical> list = repo.findAll();     	
     	Random no = new Random();
     	
     	int no1 = list.size();     	
     	while(no1 >= 31)
     	{     		
     		list.remove(no.nextInt(30));
     		no1--;
     	}
     	System.out.println(no1);
		return list;	     	
	}
	
	//Store question to the database
	public void storeQuestions(List<Technical> list)
	{
		repo.saveAll(list);
	}

	public List<Technical> getAllQuestions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	//Store question to the database
	public void storeTechnicalQuestions(List<Technical> list)
	{
		repo.saveAll(list);
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
			System.out.println("Exception occured in technical service");
		}
		System.out.println("Technical Marks: "+mark);
		studentService.saveTechnicalMarks( list.get(0).getEmail() , mark);
		
		
		
	}
}
