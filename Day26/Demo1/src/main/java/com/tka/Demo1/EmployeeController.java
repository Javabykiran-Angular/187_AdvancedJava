package com.tka.Demo1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo1.entity.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value = "getAll",method = RequestMethod.GET)
	public String getAllRecord() {
		System.out.println("U r in GetAll Method");
		return "Ur Request is Processed";
	}
	
	@RequestMapping(value = "addrecord",method = RequestMethod.POST)
	public String postData(@RequestBody Employee emp) {
		System.out.println(emp);
		return "Record is Addedd Successfully";
	}
	
	@RequestMapping(value = "updateRecord/{id}",method = RequestMethod.PUT)
	public String updateData(@RequestBody Employee emp,@PathVariable int id) {
		System.out.println(emp);
		System.out.println("Id is "+id);
		return "Update Successfully...";
	}
	
	@RequestMapping(value = "deleteRecord/{id}",method = RequestMethod.DELETE)
	public String deleteData(@PathVariable int id) {
		
		System.out.println("Id is "+id);
		return "Delete Successfully...";
	}
	
	
}
