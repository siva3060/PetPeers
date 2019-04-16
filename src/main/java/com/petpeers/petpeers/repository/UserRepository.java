package com.petpeers.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.petpeers.petpeers.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	
	//write native query here
	@Query(value = "select user_id,user_name from User where User.user_name = user_name",nativeQuery = true)
	public User findUserByName(String user_name);

}
