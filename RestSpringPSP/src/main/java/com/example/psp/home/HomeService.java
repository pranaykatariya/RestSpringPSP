package com.example.psp.home;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Home;


@Service
public class HomeService
{
	
	
	@Autowired
	HomeRepository repo;

	
	public List<Home> getHomeView() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Home> getHomeImages() {
		// TODO Auto-generated method stub
		return null;
	}
}
