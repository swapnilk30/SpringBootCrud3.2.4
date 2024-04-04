package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.dto.ApiResponseMessage;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	//handle Resource Not FOund Exception
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponseMessage> handleResourceNotFoundException(ResourceNotFoundException ex){
		ApiResponseMessage responseMessage = ApiResponseMessage.builder().message(ex.getMessage()).build();
		return new ResponseEntity<>(responseMessage,HttpStatus.NOT_FOUND);
	}

}
