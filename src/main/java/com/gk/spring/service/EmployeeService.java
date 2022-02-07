package com.gk.spring.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.gk.spring.model.Employee;
import com.gk.spring.model.Login;

public interface EmployeeService {

	public Employee saveData(Employee employee);

	public Page<Employee> getData(int name, int sise, String name2);

	public Login login(String username, String password);

	public List<Employee> getAllData();

}