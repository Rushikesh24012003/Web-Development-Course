package com.codixlabs.di.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="form" , name="leads")
public class Lead {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Name")
	private String FullName;
	
	@Column(name="Mobile")
	private String Mobile;
	
	@Column(name="Email")
	private String Email;

	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lead(int id, String fullName, String mobile, String email) {
		super();
		this.id = id;
		FullName = fullName;
		Mobile = mobile;
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	
	
	

}
