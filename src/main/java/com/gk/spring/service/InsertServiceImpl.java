package com.gk.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.spring.dao.InsertDao;
import com.gk.spring.model.Employee;

@Service
public class InsertServiceImpl implements InsertService {

	@Autowired
	private InsertDao insertDao;

	@Override
	public Employee saveData(Employee employee) {
		return insertDao.save(employee);
	}

	@Override
	public List<Employee> saveAllData(List<Employee> employeelist) {
		return insertDao.saveAll(employeelist);
	}

	@Override
	public void removeData(int id) {
		insertDao.deleteById(id);

	}

}
