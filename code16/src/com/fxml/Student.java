package com.fxml;

public class Student {
	
	private String id;
	private String name;
	private int age;
	
	Student()
	{}
	Student(String id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getId()
	{
		return this.id;
	}

}
