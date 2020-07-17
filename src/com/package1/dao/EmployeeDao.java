package com.package1.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.package1.Employee;

@Repository
public class EmployeeDao {

	public Employee getEmployee(int empID)
	{
		Employee e = new Employee();
		
		e.setEid(empID);
		e.setEname("saijaxx");
		e.setEpay(1000);
		return e;
		
	}


}
