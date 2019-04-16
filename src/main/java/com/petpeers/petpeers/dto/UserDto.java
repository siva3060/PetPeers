package com.petpeers.petpeers.dto;

import java.io.Serializable;

import lombok.Data;


//how to add jackson library to this serizliable class 
@Data
public class UserDto implements Serializable {


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String userName;
		private String userPassword;
}
