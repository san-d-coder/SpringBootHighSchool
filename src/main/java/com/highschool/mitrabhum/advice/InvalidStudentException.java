package com.highschool.mitrabhum.advice;

public class InvalidStudentException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidStudentException(String message) {
		super(message);
	}
}
