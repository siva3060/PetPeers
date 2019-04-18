package com.petpeers.petpeers.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.model.Pet;
import com.petpeers.petpeers.repository.PetRepository;

@Service
public class PetDao{

	@Autowired
	PetRepository petRepository;

	public void savePet(Pet addRequestPet){
		petRepository.save(addRequestPet);
	}

	public void updatePet(int petId,int userId){
		petRepository.updateOwner(petId,userId);
	}

	
}
