package edu.viggi.learning.spring.cloud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.viggi.learning.spring.cloud.model.Employee;

@RestController
public class TestController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Shiva");
		emp.setDesignation("software developer");
		emp.setEmpId("471");
		emp.setSalary(5000);
		return emp;
	}

}
