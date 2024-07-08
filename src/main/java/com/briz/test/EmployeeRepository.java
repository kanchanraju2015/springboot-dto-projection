package com.briz.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
@Query(value="select max(marks),min(marks),count(marks),avg(marks) from employee ",nativeQuery=true)
List<Object[]> maxmarks();



EmpDetails getMarksById(int id);  // THIS IS THROUGH INTERFACE DTO projection 

EDetails findMarksById(int id); //    THIS IS CLASS DTO projection 

@Query("select new com.briz.test.EmpDTO(e.id,e.marks) from employee e where e.id=?1")
List<EmpDTO> idmarks(int id);// dto AS CLASS must be defined note important vvi
//  NOTE NEW KEYWORD AND WRITING STYLE VVIMP
//  ABOVE DTO IS FROM QUERY ANNOTATION
EDtail getDetailsById(int id);
}

