package com.springproj.SpringDemo;

public class Alien {
	private int age;
	private Computer com;
	
	/*public Alien(int age) {
		this.age = age;
	}*/
	
	
	public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
  	public Alien(){
		System.out.println("object created");
		
	}
	public void code() {
		System.out.println("I am coding..");
		com.compile();
	}

}
