package com.training.spring;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
//	Car treated like a property
	private Car car;
	
	public Person() {
		
	}
	
	public Person(int age) {
		this.age = age;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public String getCarDetails() {
		return car.getMake() + ": " + car.getYear();
	}
}
