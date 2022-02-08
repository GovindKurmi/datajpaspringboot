package com.gk.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gk.spring.model.Employee;

@Repository
public interface InsertDao extends JpaRepository<Employee, Integer>{

}
