package OOP;

import java.util.Scanner;

public class Person {
	
	String fname;
	String lname;
	int age;
	
	
	public Person(String fname, String lname, int age) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		
	}
	
	public void Hello() {
		System.out.println("Hello!");
	}
	
	public void display() {
		System.out.println("My name is " + fname +" "+ lname + " and I am " + age + " years old.");
	}
	public void userInfo() {
		try {
		System.out.println("Please enter your first name: ");
		Scanner scan = new Scanner(System.in);
		fname= scan.next();
		}
		catch(Exception e1) {
			System.out.println("Only enter first name!");
		}
		
		try {
		System.out.println("Please enter your last name: ");
		Scanner scan = new Scanner(System.in);
		lname= scan.next();
		}
		catch(Exception e2){
			System.out.println("Only enter last name!");
		}
		
		try {
		System.out.println("Please enter your age: ");
		Scanner scan = new Scanner(System.in);
		age= scan.nextInt();
		}
		catch(Exception e3) {
			System.out.println("Only enter your age!");
		}
		
				
	}
	

}

