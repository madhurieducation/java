package com.madhuri.java8.core;

public class HelloWorld {

	String name = "";
	String message = "Hello";
	
	public String getName() {
		return name;
	}

	public String getMessage() {
		return "Hello " + name + "!" ;
	}

	public void setName(String name) {
		this.name = name;
		
	}

}
