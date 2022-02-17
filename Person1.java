package OOP;

import java.util.Scanner;

public class Person1 {
	private String fname;
	private String lname;
	private int age;
	
	Person1(String fname, String lname, int age){
		this.fname= fname;
		this.lname=lname;
		this.age=age;
	}
	
	public String getFname() {
		System.out.println("Please enter first name:");
		Scanner scan = new Scanner(System.in);
		fname= scan.next();
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
		
	}
	public String getLname() {
		System.out.println("Please enter last name:");
		Scanner scan = new Scanner(System.in);
		lname= scan.next();
		return lname;
		
	}
	public void setLname(String lname) {
		this.lname = lname;
		
	}
	public int getAge() {
		System.out.println("Please enter your age:");
		Scanner scan = new Scanner(System.in);
		age= scan.nextInt();
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public void display() {
		System.out.println("Hello, my name is " + fname + " "+ lname+ ", and I am "+ age + " years old.");
	}
}
