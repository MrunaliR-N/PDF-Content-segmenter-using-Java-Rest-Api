package com.example.PDF.process;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public class InvalidPDFException extends RuntimeException {
	    public InvalidPDFException(String message) {
	        super(message);
	    }
	    public InvalidPDFException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}

