package com.app.fruits;

public class Mango extends Fruit {


	
	
	
	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		// TODO Auto-generated constructor stub
	}

	@Override

	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}

}
