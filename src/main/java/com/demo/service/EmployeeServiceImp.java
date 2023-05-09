package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
