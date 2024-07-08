package com.briz.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/dbtest")
public String dbtest()
{
	return "this is dbtest";
}
@RequestMapping("/save")
public String data()
{
Employee e=new Employee();
Address a=new Address();
a.setCity("london");
a.setStreet("lalpur rd");
e.setName("chandrajeet");
e.setMarks(33);
e.setAddress(a);

erepo.save(e);
return "data inserted ";
}
@RequestMapping("/all")
public List<Employee> alldata()
{
	return erepo.findAll();
}
@RequestMapping("/max")
public Object maximum()
{
	return erepo.maxmarks();
}
@RequestMapping("/marks/{id}")
EmpDetails marks(@PathVariable int id)
{
	return erepo.getMarksById(id);
}
@RequestMapping("/{id}")
public EDetails idmarks(@PathVariable int id)
{
	return erepo.findMarksById(id);
}
@RequestMapping("/data/{id}")
List<EmpDTO> edetail(@PathVariable int id)
{
	return erepo.idmarks(id);
}
@RequestMapping("/by/{id}")
public EDtail mydata(@PathVariable int id)
{
	return erepo.getDetailsById(id); 
}
}
