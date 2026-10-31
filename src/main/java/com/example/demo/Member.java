package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

public class Member {
	private String name;
	private int age;
	private Date birthDay;
	private LocalDate birthDay2;
	private String address;
	
	Member(String name, int age, Date birthDay, String address) {
		this.name = name;
		this.age = age;
		this.birthDay = birthDay;
		this.address = address;
	}
	
	Member(String name, int age, Date birthDay, LocalDate birthDay2, String address) {
		this.name = name;
		this.age = age;
		this.birthDay = birthDay;
		this.birthDay2 = birthDay2;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthday(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirthDay2() {
		return birthDay2;
	}

	public void setBirthDay2(LocalDate birthDay2) {
		this.birthDay2 = birthDay2;
	}
	
	
}
