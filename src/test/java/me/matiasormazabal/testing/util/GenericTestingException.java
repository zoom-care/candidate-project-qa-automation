package me.matiasormazabal.testing.util;

public class GenericTestingException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public GenericTestingException(String message) {
		super(message);
	}
	
	public GenericTestingException(String message, Throwable t) {
		super(message, t);
	}

}