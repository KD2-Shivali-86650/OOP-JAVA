package com.app.fruits;

public class Orange extends Fruit{
	
	String name;
	String color;
	double weight;
	
	
	
	
	
	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		// TODO Auto-generated constructor stub
	}





	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}
	
	

}