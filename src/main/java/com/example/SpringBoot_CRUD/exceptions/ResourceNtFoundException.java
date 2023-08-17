package com.example.SpringBoot_CRUD.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNtFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ResourceNtFoundException(String msg) {
		super(msg);
	}
}
