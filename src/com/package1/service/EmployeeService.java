package com.package1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.package1.Employee;
import com.package1.dao.EmployeeDao;

@Service
	@Qualifier(value="service")
	public class EmployeeService {

		@Autowired
		private EmployeeDao dao;
		  public void setEmployee(EmployeeDao dao) 
		  {
			  this.dao = dao; 
			  }
		 
		
		public Employee getEmployee(int empID)
		{
			/*
			 * EmployeeDao d = new EmployeeDao(); return d.getEmployee(empID);
			 */
			return dao.getEmployee(empID);
		}
		

	

}
