package com.absonworld.happy.todoList.exception;

public class DoesNotExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoesNotExistException(String  msg){
	super(msg);
	}
	
}
