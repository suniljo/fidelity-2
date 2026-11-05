package com.example.ems.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.ems.configs.ConnectionFactory;
import com.example.ems.dao.EmployeeDAO;
import com.example.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	Statement st = null;
	
	public EmployeeDAOImpl() throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		st = con.createStatement();
	}

	@Override
	public Integer saveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values(" + emp.getEmployeeNo() +", '"
							+emp.getEmployeeName()+"'," + emp.getEmployeeSal()+")";
		int n = st.executeUpdate(sql);
		return n;
	}

	@Override
	public Employee findEmployeeById(Integer eno) throws Exception {
		Employee emp =  null;
		String sql = "select ename, sal from emp where empno="+eno;
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String name = rs.getString(1);
			float sal = rs.getFloat(2);
			emp = new Employee(eno, name, sal);
		}
		return emp;
	}

	@Override
	public Integer updateEmployee(int eno, Employee emp) throws Exception {
		int n = 0;
		if(eno == emp.getEmployeeNo()) {
			String sql = "update emp set ename='" + emp.getEmployeeName()+"', sal="+emp.getEmployeeSal() + 
							"where empno=" + eno;
			n = st.executeUpdate(sql);
		}
		return n;
	}

	@Override
	public Integer deleteEmployeeById(int eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		int n = st.executeUpdate(sql);
		return n;
	}

	@Override
	public List<Employee> findAll() throws Exception {
		List<Employee> emps = new ArrayList<Employee>();
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int eno = rs.getInt("empno");
			String name = rs.getString("ename");
			float sal = rs.getFloat("sal");
			
			Employee emp = new Employee(eno, name, sal);
			emps.add(emp);
		}
		return emps;
	}

}
