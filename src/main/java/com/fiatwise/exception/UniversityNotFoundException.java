package com.fiatwise.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Could not find the selected university")
public class UniversityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7455358311842336501L;

	public UniversityNotFoundException(String message) {
		super(message);
	}

}
