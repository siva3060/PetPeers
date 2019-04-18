package com.petpeers.petpeers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petpeers.petpeers.dto.LoginRequest;
import com.petpeers.petpeers.dto.RegistrationRequest;
import com.petpeers.petpeers.service.UserService;
import com.petpeers.petpeers.validation.UserValidation;



@RestController
@RequestMapping("/UserPanel")
public class UserController{

	@Autowired
	UserValidation userValidation;
	@Autowired
	UserService userService;

	@PostMapping("/UserRegistration")
	public  ResponseEntity<String> UserRegistration(@RequestBody RegistrationRequest registrationRequest){
		//validate service to check user name exist 	

		if(userValidation.doesUserNameExist(registrationRequest.getUserName())){
			return new ResponseEntity<String>("User already exist",HttpStatus.FOUND);
		}else{

			userService.createUser(registrationRequest);
			return new ResponseEntity<String>("User created sucessfully",HttpStatus.CREATED);
		}

		//end of method UserRegistration
	}

	@RequestMapping("/UserLogin")
	public ResponseEntity<String> UserLogin(@RequestBody LoginRequest loginRequest){
		
		if(userValidation.validateLogin(loginRequest)){
			return new ResponseEntity<String>("login sucess",HttpStatus.OK);
	       	}else{
			return new ResponseEntity<String>("login failed",HttpStatus.NOT_FOUND);
		}

	}

//	@GetMapping("/UserPets")
//	public @ResponseEntity ResponseEntity<List<Pets>> ListOfPets(@PathVariable String userName){
//	}
//
}
