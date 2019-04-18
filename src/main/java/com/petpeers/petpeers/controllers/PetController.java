package com.petpeers.petpeers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petpeers.petpeers.dto.PetAddRequest;
import com.petpeers.petpeers.service.PetService;

@RestController
public class PetController{

	@Autowired
	PetService petService;

	@PostMapping("/addPet")
	public void addPet(@RequestBody PetAddRequest petAddRequest){

		//how to find duplicate pets
		petService.addPet(petAddRequest);
	}

	@RequestMapping("/buyPet")
	public void buyPet(@PathVariable int petId,@PathVariable int userId){
		petService.buyPet(petId,userId);
	}


//j	@GetMapping("/userPets")
}
