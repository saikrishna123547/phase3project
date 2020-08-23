package com.demo.main;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name= "users") 
@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "address")
	private String address;

	@Column(name = "age")
	private int age;

	@Column(name = "date_added")
	private Date dateAdded;  
	
	@Column(name = "emailid")
	private String emailId;

	@Column(name = "pwd")
	private String pwd;

	

}
