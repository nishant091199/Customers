package com.Customer.Customer.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customerdata")
public class Customers {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
	@Column(name="Cus.Name",nullable=false)
private String name;
private long age;
}
