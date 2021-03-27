/**
 * 
 */
package com.iloads.demo.demo.domain;

/**
 * @author WDSI - Arockiasamy
 *
 */
public class Address {
	
	private Integer id;
	
	private String pinCode;
	
	private String state;
	
	private String contactNo;

	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(Integer id, String pinCode, String state, String contactNo) {
		super();
		this.id = id;
		this.pinCode = pinCode;
		this.state = state;
		this.contactNo = contactNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
