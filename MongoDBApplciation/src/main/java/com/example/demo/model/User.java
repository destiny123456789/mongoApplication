package com.example.demo.model;

//import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("usertestdata")
public class User {
	
	
	//private Integer id;
	//@Column
	@Id
	private String username;
	//@Column
	private String name;
	//@Column
	private String password;
	//@Column
	private String address;
	//@Column
	private String pincode;
	//@Column
	private String city;
	//@Column
	private String email;
	
	//@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
	//private Date joindate;
	
	
	//@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
	//private Date dob;

	
	

	public User() {
		super();
	}


	public User( String username, String name, String password, String address, String pincode, String city,
			String email) {
		super();
		//this.id = id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.email = email;
		//this.joindate = joindate;
		//this.dob = dob;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", password=" + password + ", address="
				+ address + ", pincode=" + pincode + ", city=" + city + ", email=" + email + "]";
	}


	/*public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
*/

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

/*
	public Date getJoindate() {
		return joindate;
	}


	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}*/
	
	
	

}

