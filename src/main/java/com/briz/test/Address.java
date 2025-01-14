package com.briz.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="address")
public class Address
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String street;
String city;
public Address()
{
	
}
public Address(String street,String city)
{
	this.street=street;
	this.city=city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
