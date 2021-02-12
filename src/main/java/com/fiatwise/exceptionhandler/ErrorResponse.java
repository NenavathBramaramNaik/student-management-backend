package com.fiatwise.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	private String title;
	private HttpStatus status;
	private String description;
	private LocalDateTime timestamp;

	public ErrorResponse(String title, HttpStatus status, String description, LocalDateTime timestamp) {
		this.title = title;
		this.status = status;
		this.description = description;
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return description;
	}

	public void setMessage(String description) {
		this.description = description;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
