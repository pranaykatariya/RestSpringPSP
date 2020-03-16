package com.example.psp.technical;

import java.util.List;
import java.util.Random;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Response;
import com.example.psp.model.Technical;


@Service
public class TechnicalService
{
	@Autowired
	TechnicalRepository repo;
	
	
	
		
	//Read 15 question from database and show to the rest end points
	public List<Technical> getQuestions()
	{
	    List<Technical> list = repo.findAll();     	
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
	public void storeQuestions(List<Technical> list)
	{
		repo.saveAll(list);
	}

	public List<Technical> getAllQuestions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public void calculateMarks(List<Response> list)
	{
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
		//System.out.println("Technical Marks: "+mark);
		
		
		
	}
}
