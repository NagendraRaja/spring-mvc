package com.std.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ModelAndView handleEmployeeNotFoundException(HttpServletRequest req, Exception ex) {

		ModelAndView m = new ModelAndView();

		m.addObject("exception", ex);
		m.addObject("url", req.getRequestURL());

		m.setViewName("error");

		return m;

	}

}
