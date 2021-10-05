package com.pgr.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonMainApp {

	public static void main(String[] args) throws JsonProcessingException {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Perla Reddy");
		emp.setSalary(2000d);
		List<String> technologies = new ArrayList<String>();
		technologies.add("Java");
		technologies.add("Spring Boot");
		
		emp.setTechnologies(technologies);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = objectMapper.writeValueAsString(emp);
		System.out.println(jsonData);
		
		Employee emp1 = objectMapper.readValue(jsonData, Employee.class);
		System.out.println(emp1);
		
		
	}
}
