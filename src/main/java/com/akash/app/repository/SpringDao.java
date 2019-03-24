package com.akash.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.akash.model.Employee;

@Repository
public class SpringDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	private static final String sql = "select * from employees"; 
	
	public List<Employee> isData()
	{
		List<Employee> employee = new ArrayList<>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for(Map<String, Object> row : rows)
		{
			Employee emp = new Employee();
		}
		return employee;
	}
}
