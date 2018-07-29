package com.absonworld.happy.todoList.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessengerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errormessage;
	private String reference;
	
	
	public MessengerException()
	{
		
	}
	public MessengerException(int errorCode, String errormessage, String reference) {
		this.errorCode = errorCode;
		this.errormessage = errormessage;
		this.reference = reference;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
}
