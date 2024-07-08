package com.briz.test;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Size;
//  ALL THE ANNOTATIONS OF BEANS MUST BE OF jakarta.PERSISTENCE 
@Entity(name="employee")
public class Employee 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
int marks;
@OneToOne(cascade=CascadeType.ALL)
Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;

}
}
