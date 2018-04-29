package com.syscho.controller;

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

@RestController
@RequestMapping("/emp")
@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
public class EmpController {

	List<Employee> empList = new ArrayList<Employee>();

	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmpList() {

		for (int i = 0; i <= 10; i++) {
			empList.add((new Employee("000" + i, "Emp_" + i, "Engineer", "2")));
		}
		return empList;
	}

	@PutMapping(path = "/add")
	public List<Employee> addEmp(@RequestBody Employee emp) {

		empList.add(emp);
		return empList;
	}

	@PutMapping(path = "/update")
	public List<Employee> updateEmp(@RequestBody Employee updateEmp) {

		for (Employee employee : empList) {

			if (employee.getEmpId().equalsIgnoreCase(updateEmp.getEmpId())) {
				empList.remove(employee);
				empList.add(updateEmp);
			}

		}
		return empList;
	}

	@DeleteMapping(path = "/delete")
	public List<Employee> deleteEMp(@RequestParam("empId") String empId) {

		for (Employee employee : empList) {

			if (employee.getEmpId().equalsIgnoreCase(empId)) {
				empList.remove(employee);

			}

		}
		return empList;
	}
}
