package com.bridgelabz.employeepayrollapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapplication.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapplication.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeePayrollData;
	}

	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(empId,
				new EmployeePayrollDTO("Pankaj", 30000));
		return employeePayrollData;
	}

	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeePayrollData;
	}

	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> employeePayrollDataList = new ArrayList<EmployeePayrollData>();
		employeePayrollDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000)));
		return employeePayrollDataList;
	}

	public void deleteEmployeePayrollData(int empId) {
		
	}

}
