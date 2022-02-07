package com.gk.spring.service;

import java.util.List;
import java.util.Optional;

import com.gk.spring.model.Employee;

public interface FetchService {

	public Optional<Employee> getEmpByID(int id);

	public List<Employee> getEmp();

	public List<Employee> getAllData();

}
