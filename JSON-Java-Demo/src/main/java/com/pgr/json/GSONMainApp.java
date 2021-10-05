package com.pgr.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GSONMainApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Perla Reddy");
		emp.setSalary(2000d);
		List<String> technologies = new ArrayList<String>();
		technologies.add("Java");
		technologies.add("Spring Boot");
		
		Gson gson = new Gson();
		String s = gson.toJson(emp);
		System.out.println(s);
		
		
		
		
		  JsonObject jsonObject = new JsonObject();
		  Employee emp1 = gson.fromJson(s, Employee.class);
		  System.out.println(emp1);
	}
}
