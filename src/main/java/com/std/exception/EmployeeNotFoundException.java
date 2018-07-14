package com.std.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="Employee Not Found")
public class EmployeeNotFoundException extends Exception{
	
	
	public EmployeeNotFoundException(int id)
	{
		super("employee Not found with id "+id);
	}

}
