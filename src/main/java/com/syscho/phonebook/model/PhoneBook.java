package com.syscho.phonebook.model;

import java.math.BigInteger;

public class PhoneBook {


	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String contactId;
	
	private BigInteger phoneNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public BigInteger getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}

	public PhoneBook() {
		super();
	}

	public PhoneBook(String firstName, String lastName, String dob, String email, String contactId,
			BigInteger phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.contactId = contactId;
		this.phoneNo = phoneNo;
	}
	
}
