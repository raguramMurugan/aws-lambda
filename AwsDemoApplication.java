package com.hubino.awslambda.awsDemo;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hubino.awslambda.awsDemo.dao.EmployeeDetails;
import com.hubino.awslambda.awsDemo.repository.EmployeeDao;

@SpringBootApplication
public class AwsDemoApplication {
	
	@Autowired
	private EmployeeDao emplDao;
	
	@Bean
	public Supplier<List<EmployeeDetails>> getEmployeeDetails()
	{
		return ()->emplDao.hardcodeDetails();
	}
	
	@Bean
	public Function<String, List<EmployeeDetails>> getEmployeeDetailsByOccupation()
	{
		return (value)->emplDao.hardcodeDetails().stream().filter(employee->employee.getOccupation().equals(value)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}

}
