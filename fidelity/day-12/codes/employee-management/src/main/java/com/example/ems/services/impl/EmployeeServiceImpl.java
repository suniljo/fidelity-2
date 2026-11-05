package com.example.ems.services.impl;

import java.util.List;

import com.example.ems.dao.EmployeeDAO;
import com.example.ems.dao.impl.EmployeeDAOImpl;
import com.example.ems.dto.Employee;
import com.example.ems.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO dao;
	
	public EmployeeServiceImpl() throws Exception {
		dao = new EmployeeDAOImpl();
	}

	@Override
	public void saveEmployee(Employee emp) throws Exception {
		int n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("###--- Employee Saved ---###");
	}

	@Override
	public Employee getEmployeeById(Integer eno) throws Exception {
		Employee emp = dao.findEmployeeById(eno);
		return emp;
	}

	@Override
	public void getAllEmployees() throws Exception {
		List<Employee> employees = dao.findAll();
		employees.stream().forEach(emp -> {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		});
	}

	@Override
	public void updateEmployeeById(int eno, Employee emp) throws Exception {
		int n = dao.updateEmployee(eno, emp);
		if(n > 0)
			System.out.println("###--- Employee Updated ---###");
		else
			System.err.println("no matching employee to update - " + eno);
	}

	@Override
	public void deleteEmployeeById(int eno) throws Exception {
		int n = dao.deleteEmployeeById(eno);
		if(n > 0)
			System.out.println("###--- Employee Deleted ---###");
		else
			System.err.println("no matching employee to delete - " + eno);
	}
}
