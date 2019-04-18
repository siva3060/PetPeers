package com.petpeers.petpeers.dao;
import java.util.List;
import java.util.Optional;

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

	public Optional<Pet> getPet(int petId){
		return petRepository.findById(petId);
	}
	public void updatePet(int petId,int userId){
		petRepository.updateOwner(petId,userId);
	}

	public List<Pet> getUserPetList(int userId){
		return petRepository.findAllByUserId(userId);
	}

	
}
