package com.akash.app.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService emp;
	
	@RequestMapping("/list")
	public List<Employee> getEmployees(){
		return emp.getEmployees();
	}
	@RequestMapping("/list/{id}")
	public List getEmployee(@PathVariable int id){
		return (List) emp.getEmployee(id);
	}
	
	
	
	@RequestMapping("/akash/error")
	public String error(){
		return "errorPage";
	}
	
	
	
	
	
	/*
	@Autowired
	public SpringDao springDao;
	
	@RequestMapping("/akash/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/akash/data")
	public String getData() {
		return "data";
	}*/
}
