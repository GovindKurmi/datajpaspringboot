package com.gk.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.spring.model.Employee;
import com.gk.spring.service.InsertService;

@RestController
@RequestMapping("/insert")
public class InsertController {

	@Autowired
	private InsertService insertService;

	@PostMapping("/save")
	public Employee saveData(@RequestBody Employee employee) {
		return insertService.saveData(employee);
	}
}