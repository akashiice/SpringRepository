package com.akash.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.akash.app.repository.SpringDao;

@RestController
public class SpringController {
	
	@Autowired
	public SpringDao springDao;
	
/*	@RequestMapping("/akash/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/akash/data")
	public String getData() {
		return "data";
	}*/
}
