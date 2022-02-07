package com.highschool.mitrabhum.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId = 0;
	private String addressLines = "";
	private String state = "";
	private int pin = 0;

}
