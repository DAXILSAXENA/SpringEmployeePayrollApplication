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

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

//	Annotations for mapping web requests on methods in request-handling classes with flexible method signatures.

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getEmployeePayrollData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}

//	Annotation for mapping HTTP GET requests onto specific handler methods.
	@GetMapping("/get/{empid}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable int empid) {
		return new ResponseEntity<String>("Get Call Success for id: " + empid, HttpStatus.OK);
	}

//	Annotation for mapping HTTP POST requests onto specific handler methods.
	@PostMapping("/create")
	public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		return new ResponseEntity<String>("Created Employee Payroll Data for:" + employeePayrollDTO, HttpStatus.OK);
	}

//	Annotation for mapping HTTP PUT requests onto specific handler methods.
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		return new ResponseEntity<String>("Updated Employee Payroll Data for:" + employeePayrollDTO, HttpStatus.OK);
	}

//	Annotation for mapping HTTP DELETE requests onto specific handler methods.
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable int empid) {
		return new ResponseEntity<String>("Delete Call Success for id: " + empid, HttpStatus.OK);
	}

}
