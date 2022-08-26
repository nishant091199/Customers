package com.Customer.Customer.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class INVALID extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String invalidId;
private String fieldname;
private Object fieldValue;
public INVALID(String invalidId, String fieldname, Object fieldValue) {
	super(String.format("%s not found:'%s'",invalidId,fieldname,fieldValue));
	this.invalidId = invalidId;
	this.fieldname = fieldname;
	this.fieldValue = fieldValue;
}

public String getinvalidId() {
	return invalidId;
}
public String getfieldname() {
	return fieldname;
}
public Object getfieldValue() {
	return fieldValue;
}
}
