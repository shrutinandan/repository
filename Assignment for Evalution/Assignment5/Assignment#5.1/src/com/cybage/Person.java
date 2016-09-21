package com.cybage;

public class Person {
	String name;

	
	public Person() {
		this.name = name;
	}


	public Person(String name) {
	
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return String.format("Person [name=%s]", name);
	}
	
	
	

}
