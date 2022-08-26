package com.Customer.Customer;
import java.util.List;
import javax.persistence.*;
@Entity
public class ForCustomers {
	
	
	
	@Id
	private int id;
	private String name;
	private int age;
	private List<Tcustomers> TcustomersList;
	public ForCustomers() {}
	public ForCustomers(int id,String name,String city,List<Tcustomers>TcustomersList) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.TcustomersList=TcustomersList;
	}
	public int getId() {return id;}
	public void setId(int id) {this.id=id;}
	public String geName() {return name;}
	public void setName(String name) {this.name=name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age=age;}
	public List<Tcustomers>getCollegeList(){return TcustomersList;}
	@Override
	public String toString() {
		return "University{'"
				+ ""+
				"id=" +id+
				", name='"+name+'\''+
				", city='"+age+'\''+
				", collegeList="+TcustomersList+
				'}';
	}
	}


