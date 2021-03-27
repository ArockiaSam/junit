/**
 * 
 */
package com.iloads.demo.demo.domain;

/**
 * @author WDSI - Arockiasamy
 *
 */
public class UserDetail {

	private Integer id;
	
	private String name;
	
	private Integer age;

	public UserDetail(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
