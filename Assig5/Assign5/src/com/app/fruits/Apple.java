package com.app.fruits;

public class Apple extends Fruit{
	
	
	String name;
	String color;
	double weight;
	
	
	
	
	
	







	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}













	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, false);
		// TODO Auto-generated constructor stub
	}













	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet and sour";
	}
	
	
	
	

}
