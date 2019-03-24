package com.akash.app.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	
	
	public List<Employee> list = new ArrayList<>(Arrays.asList(
			new Employee(1, "A", 1),
			new Employee(2, "B", 2),
			new Employee(3, "C", 3),
			new Employee(4, "D", 4),
			new Employee(5, "E", 5),
			new Employee(6, "F", 6)
			));
	
	public List<Employee> getEmployees()
	{
		return list;
	}

	public Employee getEmployee(int id) {
		Employee emp = null;
		for(int i = 0; i<list.size();i++)
		{
			emp = list.get(i);
			if(emp.geteId()==id)
			{
				emp.seteId(i);
				break;
			}
		
		}
		return emp;
		
//		return list.stream().filter(t -> t.geteId().findFirst().get());
	}
	
}
