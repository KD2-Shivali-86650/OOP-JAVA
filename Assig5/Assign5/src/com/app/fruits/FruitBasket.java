package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc) {
		
		System.out.println("0.Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("7.Mark a fruit as stale");
		return sc.nextInt();
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size-");
		 int size = sc.nextInt();
		 
		 Fruit[] basket = new Fruit[size];// Array of references
		
		
		int counter = 0;
		int choice;
		while ((choice = menu(sc))!=0) {
			switch(choice) {
			
			case 0:
				System.exit(choice);
				break;
				
			case 1:
				if(counter < size) {
//					System.out.println("Enter Name");
//					String name = sc.next();
//					
//					System.out.println("Enter Name");
//					String color = sc.next();
//					
//					System.out.println("Enter Name");
//					double weight= sc.nextDouble();
					
//					 basket[counter]= new Mango(color, weight, name);
//					 counter ++;
					
					basket[counter]= new Mango();
				
					basket[counter].acceptFruit(sc);
					
					counter ++;
					
					break;
				}
			case 2:
				if(counter< size) {
					
					basket[counter]= new Apple();
					
					basket[counter].acceptFruit(sc);
					
					counter ++;
					
					break;
				}
				
			case 3:
				
				if(counter < size) {
					
					basket[counter]= new Orange();
					basket[counter].acceptFruit(sc);
					counter ++;
					break;
				}
				
			case 4:
				for( Fruit e : basket)
			
					if(e != null) {
						System.out.println(e.getName());
						
					}
				break;
				
			case 5:
				
				for(Fruit e : basket)
					if(e!=null) 
					{
						System.out.println(e.toString());
					}
				break;
			
				
				
			case 6:
				
				System.out.println("Taste of all Stale(not Fresh) fruit ");
				for(Fruit e : basket) {
					if(e != null && e.getFresh(false)) {
						
						System.out.println(e.getName()+ " "+e.taste());
					}
					}
					
					
					
				break;
				
				
				
			case 7:
				System.out.println("Enter Index");
				int index = sc.nextInt();
				
				if(index>0 && index<counter && basket[index]!=null) {
					
					basket[index].setFresh(false);

					System.out.println("Mark it Stale");
				}
				
				break;
				
				
			case 8:
				
				for(Fruit e : basket)
					if(e.taste().equals("Sour")) {
						
						e.setFresh(false);
					}
				
				break;
			}
			
			
		}



		
	}

}
