package question3;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1= sc.next();
		
		String s="";
		
		for(int i = s1.length()-1 ; i>=0; i--) {
			
			s = s + s1.charAt(i);
			
		}

		System.out.println("Reversed String-" +s);
	
		
		if(s1.equals(s)) {
			
			System.out.println("String is pallondrom");
		}
		else
		{
			System.out.println("String is not pallondrom");
			
		}
	}

}