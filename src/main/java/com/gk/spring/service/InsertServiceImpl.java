package com.gk.spring.service;

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

}
