package com.highschool.mitrabhum.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorMessage> notFound(NotFoundException e){
		ErrorMessage exceptionResponse = new ErrorMessage(e.getMessage(),"Please check the ID and try again!");
		return new ResponseEntity<ErrorMessage>(exceptionResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidStudentException.class)
	public ResponseEntity<ErrorMessage> inValidStudent(InvalidStudentException e){
		ErrorMessage exceptionResponse = new ErrorMessage(e.getMessage(),"Please check the ID and try again!");
		return new ResponseEntity<ErrorMessage>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InvalidTeacherException.class)
	public ResponseEntity<ErrorMessage> notFound(InvalidTeacherException e){
		ErrorMessage exceptionResponse = new ErrorMessage(e.getMessage(),"Please check the ID and try again!");
		return new ResponseEntity<ErrorMessage>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}

}


