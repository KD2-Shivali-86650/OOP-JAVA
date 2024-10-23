package com.sunbeam;

import java.util.Scanner;
import com.sunbeam.*;

public class Program {

	public static void main(String[] args)  {
		
		Accept a = new Accept();
	
		try {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String-");
	
		String s= sc.next();
		a.AcceptString(s);
		System.out.println("Lenght of String-" +s.length());
		
		
		}
		catch(ExceptionLineTooLong e) {
			
			e.printStackTrace();
		}
	
	

		}
		
}

