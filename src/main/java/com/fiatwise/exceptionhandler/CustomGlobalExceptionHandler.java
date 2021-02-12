package com.fiatwise.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fiatwise.exception.StudentNotFoundException;
import com.fiatwise.exception.UniversityNotFoundException;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public final ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException ex,
			WebRequest request) {
		ErrorResponse error = new ErrorResponse(String.valueOf(HttpStatus.NOT_FOUND.value()), HttpStatus.NOT_FOUND,
				ex.getMessage(), LocalDateTime.now());
		return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(UniversityNotFoundException.class)
	public final ResponseEntity<Object> handleUniversityNotFoundException(UniversityNotFoundException ex,
			WebRequest request) {
		ErrorResponse error = new ErrorResponse(String.valueOf(HttpStatus.NOT_FOUND.value()), HttpStatus.NOT_FOUND,
				ex.getMessage(), LocalDateTime.now());
		return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorResponse exceptionResponse = new ErrorResponse(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()),
				HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), LocalDateTime.now());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
