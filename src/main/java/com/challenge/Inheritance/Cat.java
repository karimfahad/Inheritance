package com.challenge.Inheritance;

public class Cat extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat; 
	
	public Cat(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.coat = coat;
		this.tail = tail;
		this.legs = legs;
		
	
		
	}
	
	private void chew() {
		System.out.println("cat chew");
		
	}

	@Override
	public void eat() {
		System.out.println("cat eat");
		chew();
		//super.eat();
	}
	
	

	
}
