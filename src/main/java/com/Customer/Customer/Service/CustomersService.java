package com.Customer.Customer.Service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.Customer.Customer.Model.Customers;

public interface CustomersService {
Customers saveCustomers(Customers cutomers);
List<Customers>getAllCustomers();
}
