package com.abc.abcmart.exception;

public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException() {
		
		}
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}
	
}
