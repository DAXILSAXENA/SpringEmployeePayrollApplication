/** IEmployeePayrollService.java */
package com.bridgelabz.employeepayrollapplication.service;

import java.util.List;

import com.bridgelabz.employeepayrollapplication.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapplication.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

	List<EmployeePayrollData> getEmployeePayrollData();

	void deleteEmployeePayrollData(int empId);

}
