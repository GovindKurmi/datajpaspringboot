package com.gk.spring.service;

import java.util.List;

import com.gk.spring.model.Employee;

public interface InsertService {

	public Employee saveData(Employee employee);

	public List<Employee> saveAllData(List<Employee> employeelist);

}
