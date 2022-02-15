package com.gk.spring.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.spring.config.ApiResponse;
import com.gk.spring.exception.DataNotFoundException;
import com.gk.spring.model.Employee;
import com.gk.spring.service.FetchService;

@RestController
@RequestMapping("/fetch")
public class FetchController {
	@Autowired
	private FetchService fetchService;

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(FetchController.class);

	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getEmpByID(@PathVariable("id") int id) {
		logger.info("inside of class FetchController and getEmpByID method");
		Optional<Employee> emp = null;
		try {
			emp = fetchService.getEmpByID(id);
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@GetMapping("/empdata")
	public ApiResponse<List<Employee>> getAllData() {
		logger.info("inside of class FetchController and getAllData method");
		List<Employee> emp = fetchService.getAllData();
		String count = String.valueOf(emp.size());
		return new ApiResponse<>("GET", count, emp);
	}

	@GetMapping("/sortby/{field}")
	public ApiResponse<Page<Employee>> sorting(@PathVariable("field") String field) {
		Page<Employee> emp = fetchService.sorting(field);
		String count = String.valueOf(emp.getSize());
		return new ApiResponse<>("GET", count, emp);
	}

	@GetMapping("/salaryTotal")
	public Double getSalaryTotal() {
		return fetchService.getSalaryTotal();
	}

	@GetMapping("/getdata")
	public void getdata() {

	}

}
