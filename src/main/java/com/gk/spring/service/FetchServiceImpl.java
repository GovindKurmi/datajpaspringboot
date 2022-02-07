package com.gk.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.spring.dao.FetchDao;
import com.gk.spring.model.Employee;

@Service
public class FetchServiceImpl implements FetchService {

	@Autowired
	private FetchDao dao;

	@Override
	public Optional<Employee> getEmpByID(int id) {
		System.out.println("igg" + id);
		Optional<Employee> emp = dao.findById(id);
		return emp;
	}

	@Override
	public List<Employee> getEmp() {
		List<Employee> emp = dao.findAll();
		return emp;
	}

	@Override
	public List<Employee> getAllData() {
		List<Employee> employees = dao.findAll();
		return employees;
	}

}
