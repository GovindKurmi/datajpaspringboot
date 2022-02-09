package com.gk.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.gk.spring.model.Employee;

public interface FetchService {

	public Optional<Employee> getEmpByID(int id);

	public List<Employee> getAllData();

	public Page<Employee> sorting(String field);

	public Double getSalaryTotal();

}
