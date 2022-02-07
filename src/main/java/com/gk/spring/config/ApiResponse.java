package com.gk.spring.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {

	private String method;
	private String errorMessage;
	private T response;
}
