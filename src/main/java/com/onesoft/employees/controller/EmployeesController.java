package com.onesoft.employees.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")  
public class EmployeesController {


	
		@GetMapping(value="/displayh")
		public String display() {  
			return "hello world"; 
		}

	}



