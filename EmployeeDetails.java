package com.hubino.awslambda.awsDemo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails { 
	
	private Integer id;
	private String name;
	private String occupation;
	private String address;
	

}
