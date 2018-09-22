package com.example.practise.model;
import lombok.*;
@NoArgsConstructor
public class Address {
	 @Getter @Setter int hno;
	 @Getter @Setter int sno;
	 @Getter @Setter int rn;

public Address(int hno, int sno, int rn) {
	super();
	this.hno = hno;
	this.sno = sno;
	this.rn = rn;
	
}

}
