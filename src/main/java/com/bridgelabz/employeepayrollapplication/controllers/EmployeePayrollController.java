/**
 * Rest Controller to demonstrate the various HTTP Methods
 * 
 * @author DAXIL SAXENA
 * @since 10.08.2021
 */

package com.bridgelabz.employeepayrollapplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapplication.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapplication.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapplication.model.EmployeePayrollData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

//	Annotations for mapping web requests on methods in request-handling classes with flexible method signatures.

//	@RequestMapping(value = { "", "/", "/get" })
//	public ResponseEntity<String> getEmployeePayrollData() {
//		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
//	}

	@RequestMapping(value = { "", "/", "/get" })
	// ResponseEntity used for returning JSON Object
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000));
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

//	Annotation for mapping HTTP GET requests onto specific handler methods.
//	@GetMapping("/get/{empid}")
//	public ResponseEntity<String> getEmployeePayrollData(@PathVariable int empid) {
//		return new ResponseEntity<String>("Get Call Success for id: " + empid, HttpStatus.OK);
//	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(empId,
				new EmployeePayrollDTO("Pankaj", 3000));
		ResponseDTO responseDTO = new ResponseDTO("Get Call For ID Successful", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

//	Annotation for mapping HTTP POST requests onto specific handler methods.
//	@PostMapping("/create")
//	public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
//		return new ResponseEntity<String>("Created Employee Payroll Data for:" + employeePayrollDTO, HttpStatus.OK);
//	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Create Call For Employee Successful", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

//	Annotation for mapping HTTP PUT requests onto specific handler methods.
//	@PutMapping("/update")
//	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
//		return new ResponseEntity<String>("Updated Employee Payroll Data for:" + employeePayrollDTO, HttpStatus.OK);
//	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Update Call For Employee Successful", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

//	Annotation for mapping HTTP DELETE requests onto specific handler methods.
//	@DeleteMapping("/delete/{empid}")
//	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable int empid) {
//		return new ResponseEntity<String>("Delete Call Success for id: " + empid, HttpStatus.OK);
//	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + empId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

}