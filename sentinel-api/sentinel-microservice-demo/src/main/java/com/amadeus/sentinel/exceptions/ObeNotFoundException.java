package com.amadeus.sentinel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Thrown when Obe is Not Present
 * @author sinhas
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason = "OBE Not Found")
public class ObeNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObeNotFoundException(String message) {
		super(message);
	}

}
