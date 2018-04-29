package com.syscho.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.syscho.model.Employee;
import com.syscho.phonebook.model.PhoneBook;

@RestController
@RequestMapping("/phone")
@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
public class PhoneController {

	List<PhoneBook> empList = new ArrayList<PhoneBook>();

	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PhoneBook> getEmpList() {

		for (int i = 0; i <= 10; i++) {
			empList.add((new PhoneBook("RAvi_" + i, "Soni_" + i, "20/02/1922", "xxxxx.gmail.com","82976851",BigInteger.TEN)));
		}
		return empList;
	}
	@PutMapping(path = "/add")
	public List<PhoneBook> addEmp(@RequestBody PhoneBook emp) {

		empList.add(emp);
		return empList;
	}
	/*

	@PutMapping(path = "/update")
	public List<PhoneBook> updateEmp(@RequestBody Employee updateEmp) {

		for (Employee employee : empList) {

			if (employee.getEmpId().equalsIgnoreCase(updateEmp.getEmpId())) {
				empList.remove(employee);
				empList.add(updateEmp);
			}

		}
		return empList;
	}

	@DeleteMapping(path = "/delete/{empId}")
	public List<PhoneBook> deleteEMp(@PathVariable("empId") String empId) {

		for (PhoneBook employee : empList) {

			if (employee.getEmpId().equalsIgnoreCase(empId)) {
				empList.remove(employee);

			}

		}
		return empList;
	}
	*/
}
