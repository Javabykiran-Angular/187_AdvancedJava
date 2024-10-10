package com.tka.Demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo1.entity.Employee;

@RestController
@RequestMapping("productapi")
public class ProductController {
	
	@GetMapping("getAll")
	public String getAllRecord() {
		System.out.println("U r in GetAll Method");
		return "Ur Request is Processed";
	}
	
	
	@PutMapping("updateRecord")
	public String updateData(@RequestBody Employee emp,@RequestParam int id ) {
		System.out.println(emp);
		System.out.println("Id is "+id);
		return "Update Successfully...";
	}
	
	
	

}
