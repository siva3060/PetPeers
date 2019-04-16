package com.petpeers.petpeers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.dao.UserDao;
import com.petpeers.petpeers.dto.RegistrationRequest;
import com.petpeers.petpeers.model.User;
import com.petpeers.petpeers.validation.UserValidation;

@Service
public class UserService{

		@Autowired
		UserValidation userValidation;
		@Autowired
		UserDao userDao;

		public void createUser(RegistrationRequest registrationRequest){

			User user = new User();
			user.setUserName(registrationRequest.getUserName());
			user.setUserPassword(registrationRequest.getUserPassword());
			userDao.saveUser(user);
	
}
}
