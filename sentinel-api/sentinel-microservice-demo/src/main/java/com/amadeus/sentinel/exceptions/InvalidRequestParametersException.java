package com.amadeus.sentinel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Thrown in Case of Malformed Request hits the server
 * @author sinhas
 *
 */
@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class InvalidRequestParametersException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRequestParametersException(String message) {
		super(message);
	}
}
