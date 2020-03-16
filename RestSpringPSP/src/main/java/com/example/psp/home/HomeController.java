package com.example.psp.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Home;

@RestController
public class HomeController 
{
	@Autowired
	HomeService HomeService;
	
	@GetMapping("getHomeView")
	public List<Home> getHomeView()
	{
		return HomeService.getHomeView();	
	}
	
	
	@GetMapping("getHomeImages")
	public List<Home> getHomeImages()
	{
		return HomeService.getHomeImages();
	}
	
}