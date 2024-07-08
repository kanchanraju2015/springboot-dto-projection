package com.briz.test;

//  DTO IS USED FOR PROJECTIONS(MEANING SELECTED COLUMN DISPLAY)
//  THIS IS DTO EXAMPLE SETTER/GETTER AND PARAMETERIZED FUNCTION MUST 
public class EDetails 
{
int id;
int marks;
public int getId() {
	return id;
}
public EDetails(int id, int marks) {
	super();
	this.id = id;
	this.marks = marks;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
}
