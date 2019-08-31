package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.Employee;
import tws.repository.EmployeeMapper;

@Service
public class EmployeeService {
	 @Autowired
	private EmployeeMapper employeeMapper;

	public List<Employee> findAllEmployees(){
		return employeeMapper.selectAll();
	}
}
