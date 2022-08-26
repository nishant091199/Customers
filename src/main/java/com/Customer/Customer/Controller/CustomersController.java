package com.Customer.Customer.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Customer.Customer.Model.Customers;
import com.Customer.Customer.Service.CustomersService;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
private CustomersService customersserivce;

public CustomersController(CustomersService customersserivce) {
	super();
	this.customersserivce = customersserivce;
}
@PostMapping()
public ResponseEntity<Customers> save(@RequestBody Customers customers){
	return new ResponseEntity<Customers>(CustomersService.saveCustomers(customers,HttpStatus.CREATED)) 
			}
@GetMapping
public List<Customers> getAllCustomers(){
	return customersservice.getallCustomers
}
}
