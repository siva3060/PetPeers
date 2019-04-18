package com.petpeers.petpeers.dto;
import lombok.Data;

@Data
public class PetAddRequest{

	private int petId;
	private String petName;
	private int petAge;
	private String petPlace;
}
