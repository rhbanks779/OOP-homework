package OOP;

import java.util.Scanner;

public class Students extends Person {
	
	String major;
	double grade1, grade2, grade3;
	double sum;
	double avg;

	public Students(String fname, String lname, int age, String major, double grade1, double grade2, double grade3) {
		super(fname, lname, age);
		this.major = major;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		
	}
	public void userInfo() {
		super.userInfo();
		try {
			System.out.println("Please enter your major: ");
			Scanner scan = new Scanner(System.in);
			major= scan.next();
		}
		catch(NumberFormatException e) {
			System.out.println("Only enter a major!");
		}
		try {
			System.out.println("Please enter your grade for subject 1: ");
			Scanner scan = new Scanner(System.in);
			grade1= scan.nextDouble();
		}
		catch(NumberFormatException e) {
			System.out.println("Only enter a number!");
		}
		
		try {
			System.out.println("Please enter your grade for subject 2: ");
			Scanner scan = new Scanner(System.in);
			grade2 = scan.nextDouble();
		}
		catch(Exception e1) {
			System.out.println("Only enter a number!");
		}
		
		try {
			System.out.println("Please enter your grade for subject 3: ");
			Scanner scan = new Scanner(System.in);
			grade3= scan.nextDouble();
		}
		catch(Exception e) {
			System.out.println("Only enter a number!");
		}
		
	}
	public double gradeAvg() {
		this.sum = (grade1 + grade2 + grade3);
		double avg = (sum/3);
		return avg;
		
	}
	
	public void display3() {
		super.display();
		System.out.println("My major is " + major + ", and my course average is: " + gradeAvg() +"%");
		System.out.println();
	}
}
