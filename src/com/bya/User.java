package com.bya;

public class User {
	private String name;
	private String age;
	
	
	
	
	
	public User() {
		super();
	}

	public User(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
