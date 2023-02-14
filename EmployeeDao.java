package com.hubino.awslambda.awsDemo.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.hubino.awslambda.awsDemo.dao.EmployeeDetails;
@Repository
public class EmployeeDao {
	
	public List<EmployeeDetails> hardcodeDetails()
	{
		return Stream.of(
				new EmployeeDetails(101220,"Sumithra","Software Developer","Chennai"),
				new EmployeeDetails(101221,"Ramanan","Engineer","Madurai"),
				new EmployeeDetails(101222,"Ragul",".net Developer","Coimbatore"),
				new EmployeeDetails(101223,"Senthil Kumar","System Engineer","Chennai"),
				new EmployeeDetails(101224,"Praveen","Devops Engineer","Madurai"),
				new EmployeeDetails(101225,"Bala Kumar","Scrum Master","Bangalore")
				).collect(Collectors.toList());
	}

}
