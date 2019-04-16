package com.petpeers.petpeers.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.model.User;
import com.petpeers.petpeers.repository.UserRepository;



@Service
public class UserDao{

	@Autowired
	UserRepository userRepository;

	public User getUserByName(String user_name){
		return userRepository.findUserByName(user_name);
	}

	public void saveUser(User currentUser){
		userRepository.save(currentUser);
	}
}
