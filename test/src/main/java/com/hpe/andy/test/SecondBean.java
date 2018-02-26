package com.hpe.andy.test;

public class SecondBean implements Doable {

	private String name;
	private int age;
	private ThirdBean thirdBean;
	
	

	
	public ThirdBean getThirdBean() {
		return thirdBean;
	}

	public void setThirdBean(ThirdBean thirdBean) {
		this.thirdBean = thirdBean;
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
		System.out.println("From SecondBean");
		
	}
	
	
}
