package com.briz.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController 
{
@Autowired
AddressRepository arepo;
@RequestMapping("/tests")
public String thisistest()
{
	return "this is test only";
}
@RequestMapping("/savedata")
public String save()
{
    ArrayList<Address> a=new ArrayList<Address>();
    a.add(new Address("lalpur","ranchi")); // see the address class 
    a.add(new Address("kantatoli","ranchi"));
    a.add(new Address("upper bazar","ranchi"));    
    arepo.saveAll(a);// all the data is saved at once 
	return "data saved to database";
}
}
