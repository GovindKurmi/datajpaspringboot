package com.gk.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.spring.config.ApiResponse;
import com.gk.spring.model.Employee;
import com.gk.spring.service.FetchService;

@RestController
@RequestMapping("/fetch")
public class FetchController {
	@Autowired
	private FetchService fetchService;

	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getEmpByID(@PathVariable("id") int id) {
		System.out.println(id);
		Optional<Employee> emp = fetchService.getEmpByID(id);
		return emp;
	}

	@GetMapping("/empdata")
	public ApiResponse<List<Employee>> getAllData() {
		List<Employee> emp = fetchService.getAllData();
		String count = String.valueOf(emp.size());
		return new ApiResponse<>("GET", count, emp);
	}

}
