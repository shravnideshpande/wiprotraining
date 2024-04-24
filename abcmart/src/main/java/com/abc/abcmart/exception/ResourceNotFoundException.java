package com.abc.abcmart.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		
		}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	} 

}
