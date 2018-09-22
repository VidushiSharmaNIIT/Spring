package com.example.practise.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter @Setter
public class DetailOfPeople {
	 @Getter @Setter String name;
	 @Getter @Setter int age;
	 @Getter @Setter String sex;
	 @Getter @Setter boolean working;
	 Address address;
	
public DetailOfPeople(String name, int age, String sex, boolean working,Address address) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.working = working;
	this.address=address;
}



}
