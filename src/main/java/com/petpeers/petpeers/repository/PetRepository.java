package com.petpeers.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.petpeers.petpeers.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

	@Query(value = "update Pet set ownerId = userId where petId = petId ",nativeQuery = true)
	void updateOwner(int petId,int userId);

}
