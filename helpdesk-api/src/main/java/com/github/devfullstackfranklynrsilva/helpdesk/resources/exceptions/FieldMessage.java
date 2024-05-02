package com.github.devfullstackfranklynrsilva.helpdesk.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fieeldName;
	private String message;

	public FieldMessage() {
		super();
	}

	public FieldMessage(String fieeldName, String message) {
		super();
		this.fieeldName = fieeldName;
		this.message = message;
	}

	public String getFieeldName() {
		return fieeldName;
	}

	public void setFieeldName(String fieeldName) {
		this.fieeldName = fieeldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
