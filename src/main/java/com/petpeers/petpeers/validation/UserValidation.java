package com.petpeers.petpeers.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.dao.UserDao;
import com.petpeers.petpeers.dto.LoginRequest;
import com.petpeers.petpeers.model.User;

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

	public boolean validateLogin(LoginRequest loginRequest){

//		if(doesUserNameExist(loginRequest.getUserName())){
//			//if((userDao.getUserByName(loginRequest.getUserName())).getUserPassword()loginRequest.getUserPassword()){
//			if()
//				return true;
//			}else{
//				return false;
//			}
//		}
//
		boolean validStatus = false;
		User validateUser;
	
		validateUser = userDao.getUserByName(loginRequest.getUserName());
		
		if(validateUser != null) {
			if(validateUser.getUserPassword().equals(loginRequest.getUserPassword())) {
				validStatus = true;
			}
		}else {
			validStatus = false;
		}
		
		return validStatus;
		
				//end of method  validate user
	}
	
}
