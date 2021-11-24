package com.tavant.spring.jdbc.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tavant.spring.jdbc.beans.Employee;

@Repository
public class EmployeeRepository {
	Scanner sc = new Scanner(System.in);
	@Autowired
	private JdbcTemplate jdbcTemp;

	public int getCount() {
		return jdbcTemp.queryForObject("select count(*) from emp", Integer.class);
	}

	public List<Employee> getAllEmployee() {
		return jdbcTemp.query("select * from emp", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee theemployee = new Employee();
				theemployee.setEmployeeName(rs.getString("employeeName"));
				theemployee.setEmployeeID(rs.getInt("employeeId"));
				theemployee.setEmployeeDept(rs.getString("employeeDept"));
				theemployee.setEmployeeNumber(rs.getInt("employeeNumber"));
				return theemployee;
			}

		});

	}

	public void addEmployee(@RequestBody Employee employee) {
		jdbcTemp.update("insert into emp(employeeId,employeeName,employeeDept,employeeNumber) values(?,?,?,?)",
				employee.getEmployeeID(), employee.getEmployeeName(), employee.getEmployeeDept(),
				employee.getEmployeeNumber());
	}

	public void updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {

		jdbcTemp.update("update emp set employeeId=?,employeeName=?,employeeDept=?,employeeNumber=? where Id=?",
				employee.getEmployeeID(), employee.getEmployeeName(), employee.getEmployeeDept(),
				employee.getEmployeeNumber(), employeeId);
	}

	public void deleteEmployee(@PathVariable int employeeId) {

		jdbcTemp.update("delete from emp where employeeId=?", employeeId);
	}
}
