/**
 * 
 */
package com.iloads.demo.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author WDSI
 *
 */
public class TestDto {
	
	@NotNull
	@Size(max = 20, message = "must not be greater than 20", groups = {TestDtoVal.class})
	private String name;
	
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
