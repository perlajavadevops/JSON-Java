package com.pgr.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

	@JsonProperty(value = "empId")
	private int id;

	private String name;

	//@JsonIgnore
	private Double salary;
	
	private List<String> technologies;


}
