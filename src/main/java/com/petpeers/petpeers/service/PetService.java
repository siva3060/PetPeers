package com.petpeers.petpeers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.petpeers.dao.PetDao;
import com.petpeers.petpeers.dto.PetAddRequest;
import com.petpeers.petpeers.model.Pet;


@Service
public class PetService{

	@Autowired
	PetDao petDao;

	public void addPet(PetAddRequest petAddRequest){
		Pet currentPet = new Pet();
		currentPet.setPetName(petAddRequest.getPetName());
		currentPet.setPetAge(petAddRequest.getPetAge());
		currentPet.setPetPlace(petAddRequest.getPetPlace());
		currentPet.setUserId(0);
		petDao.savePet(currentPet);
	}

	public Optional<Pet> getPetDetails(int petId){
		Optional<Pet> currentPet = petDao.getPet(petId);
		return currentPet;
	}
	public void buyPet(int petId,int userId){
		//Pet currentPet = new petDao.getPet(petId);
		//currentPet.setOwnerId(userId);
		petDao.updatePet(petId,userId);
	}

	public List<Pet> getPetsByUserId(int userID){
		return petDao.getUserPetList(userID);
	}
}
