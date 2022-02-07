package com.gk.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gk.spring.model.Login;

public interface LoginDao extends JpaRepository<Login, Integer> {

	public Login findByUsernameAndPassword(String username, String password);

}
