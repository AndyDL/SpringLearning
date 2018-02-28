package com.hpe.andy.test;


public class FirstBean implements Doable{

	//PRIVATE FIELDS
	private String name;
	private int age;
	private int grade;
	private String namedParameter; 
	private SecondBean secondBean;
	private SecondBean segundoBean;

	
	//NO FIELD CONSTRUCTOR
	public FirstBean(){	
	}
	

	//ARG CONSTRUCTOR
	public FirstBean(SecondBean secondBean, int age, String name, int grade, String namedParameter){	
		this.secondBean = secondBean;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.namedParameter = namedParameter;
	}
	
	
	//SETTERS
	public void setSegundoBean(SecondBean segundoBean) {
		this.segundoBean = segundoBean;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

	public void setGrade(int grade) {
		this.grade = grade;
	}


	public void setNamedParameter(String namedParameter) {
		this.namedParameter = namedParameter;
	}


	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}
	
	
	//GETTERS
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getNamedParameter() {
		return namedParameter;
	}
	
	public SecondBean getSecondBean() {
		return secondBean;
	}
	
	public int getGrade() {
		return grade;
	}

	
	//METHODS
	public void printSomething() {
		System.out.println("From FirstBean");
		
	}

	
}
