package com.petpeers.petpeers.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pets")
public class Pet{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int petId;
	private String petName;
	private int petAge;
	private String petPlace;
	private int OwnerId;

}
