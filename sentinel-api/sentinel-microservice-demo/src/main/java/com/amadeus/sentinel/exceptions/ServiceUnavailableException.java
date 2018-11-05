package com.amadeus.sentinel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Thrown when some backend service fails to respond
 * @author sinhas
 *
 */
@ResponseStatus(value=HttpStatus.GATEWAY_TIMEOUT)
public class ServiceUnavailableException extends Exception {
	public ServiceUnavailableException(String message) {
		super(message);
	}
}
