package com.ProativaDigital.ProjetoTesteSpring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public ResourceNotFoundException(Object id) {
		super("User not found id: " + id);
	}
}
