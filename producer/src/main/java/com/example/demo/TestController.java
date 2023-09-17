package com.example.demo;

import lombok.Data;

@Data
public class Employee {
private int eid;
private String ename;
private double salary;
}



package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

	@RequestMapping("/employee")
	public Employee data() {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("kk");
		e.setSalary(100000);
		return e;
	}
	
	
}
