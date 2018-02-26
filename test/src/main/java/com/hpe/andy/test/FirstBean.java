package com.hpe.andy.test;

import java.beans.ConstructorProperties;

public class FirstBean implements Doable{

	private String name;
	private int age;
	private int grade;
	private String namedParameter; 
	private SecondBean secondBean;
	private SecondBean segundoBean;

	
	//Constructor
	public FirstBean(){	
	}
	

	public FirstBean(SecondBean secondBean, int age, String name, int grade, String namedParameter){	
		this.secondBean = secondBean;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.namedParameter = namedParameter;
	}
	
	
	public void setSegundoBean(SecondBean segundoBean) {
		this.segundoBean = segundoBean;
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

	
	public void printSomething() {
		System.out.println("From FirstBean");
		
	}

	
	
	
	
	
	
}
