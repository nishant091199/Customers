package com.Customer.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Customer.Customer.Model.Customers;
@Repository
public interface CustomersRepository extends JpaRepository<Customers,Long> {

}
