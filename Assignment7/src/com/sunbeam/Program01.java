package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudentMarkComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return Double.compare(s2.getMarks(), s1.getMarks());
		
	}
}
	
	class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getName().compareTo(o2.getName());
			
		}
	}
		
		
		class StudentRollComparator implements Comparator<Student>{

			@Override
			public int compare(Student s, Student s3) {
				
				return s.getRoll() - s3.getRoll();
			}
			
		
		
		
		
		}
		
		
		
	

public class Program01 {
	
	public static int menu(Scanner sc) {
		
		System.out.println("0. EXIT");
		System.out.println("1. Display All Students ");
		System.out.println("2. Sorted on their city (asc)");
		System.out.println("3. Sorted on their on marks (desc)");
		System.out.println("4. Sorted on their on name (asc)");
		System.out.println("5. Sorted on the rollno");
		return sc.nextInt();
		
	}
	
	public static void displayStudents(Student[] arr) {
		System.out.println("*************************");
		for(Student s : arr)
			System.out.println(s);
		System.out.println("*************************");
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[5];
		Comparator<Student> comparator;
		arr[0]=new Student(1,"shiv","Sangli", 87);
		arr[1]=new Student(5,"Pinki","Sangola", 97);
		arr[2]=new Student(3,"Vaibhav","Pune", 80);
		arr[3]=new Student(4,"Aditya","Satara", 77);
		arr[4]=new Student(2,"Ganesh","Mumbai", 98);
		
		int choice;
		while((choice = menu(sc))!=0) {
			switch(choice) {
			case 1:
				displayStudents(arr);
				break;
			case 2:
				Arrays.sort(arr);
				displayStudents(arr);
			break;
			case 3:
				comparator = new StudentMarkComparator();
				Arrays.sort(arr , comparator);
				displayStudents(arr);
				
				break;
			case 4:
				comparator = new StudentNameComparator();
				Arrays.sort(arr, comparator);
				
				displayStudents(arr);
				break;
			case 5:
				comparator = new StudentRollComparator();
				Arrays.sort(arr, comparator);
				displayStudents(arr);
				break;
			
			
			}
			
			
		}

	}

}
