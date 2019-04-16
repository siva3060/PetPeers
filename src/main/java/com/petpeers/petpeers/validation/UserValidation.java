package com.petpeers.petpeers.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.dao.UserDao;

@Service
public class UserValidation{

	@Autowired
	UserDao userDao;

	public boolean doesUserNameExist(String userName) {
		if((userDao.getUserByName(userName)) != null){
			return true;
		}else{
			return false;
		}
		
	
	//end of method does user exist	
	}

	public boolean validateUser(LoginRequest loginRequest){

		if(doesUserExist(loginRequest.getUserName()){
			if(userDao.getUserByName().getUserPassword() == loginRequest.getUserPassword()){
				return true;
			}else{
				return false;
			}
		}

		//end of method  validate user
	}
}
