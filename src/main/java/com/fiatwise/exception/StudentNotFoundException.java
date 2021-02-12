package com.fiatwise.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Could not find the Student")
public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1407590669021481210L;

	public StudentNotFoundException(String message) {
		super(message);
	}

}