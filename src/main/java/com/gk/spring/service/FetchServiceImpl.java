package com.gk.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gk.spring.dao.FetchDao;
import com.gk.spring.exception.DataNotFoundException;
import com.gk.spring.model.Employee;

@Service
public class FetchServiceImpl implements FetchService {

	@Autowired
	private FetchDao dao;

	@Override
	public Optional<Employee> getEmpByID(int id) throws DataNotFoundException  {
		boolean check = dao.existsById(id);
		Optional<Employee> emp = null;
		if (check == true) {
			emp = dao.findById(id);
		}
		else {
		  throw	new DataNotFoundException("id is not found");
		}

		return emp;
	}

	@Override
	public List<Employee> getAllData() {
		List<Employee> employees = dao.findAll();
		return employees;
	}

	@Override
	public Page<Employee> sorting(String field) {
		Page<Employee> emp = dao.findAll(PageRequest.of(0, 10, Sort.by(field).ascending()));
		return emp;
	}

	@Override
	public Double getSalaryTotal() {
		List<Employee> list = dao.findAll();
		Optional<Double> salaryTotal = list.stream().map(m -> m.getSalary()).reduce((a, b) -> a + b);
		return salaryTotal.get();
	}

}
