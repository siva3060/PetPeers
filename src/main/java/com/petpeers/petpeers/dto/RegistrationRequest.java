package com.petpeers.petpeers.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RegistrationRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userPassword;	
}
