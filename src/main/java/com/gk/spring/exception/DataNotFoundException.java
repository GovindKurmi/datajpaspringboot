package com.gk.spring.exception;

public class DataNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String m) {
		super(m);
	}
}
