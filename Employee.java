package OOP;

import java.util.Scanner;

public class Employee extends Person {
	
	int id;
	double salary;

	public Employee(String fname, String lname, int age, int id, double salary) {
		super(fname, lname, age);
		this.id=id;
		this.salary=salary;
	}

	public void userInfo() {
		super.userInfo();
		
		try {
			System.out.println("Please enter your employee id number: ");
			Scanner scan = new Scanner(System.in);
			id = scan.nextInt();
		}
		catch(Exception e) {
			System.out.println("Only enter a number!");
		}
		
		try {
			System.out.println("Please enter your employee salary: ");
			Scanner scan = new Scanner(System.in);
			salary = scan.nextDouble();
		}
		catch(Exception e1) {
			System.out.println("Only enter a number!");
		}
	}
	
	public void display2() {
		System.out.println("--------");
		super.display();
		System.out.println("Id number is: #"+ id);
		System.out.println("Annual salary is: $" + salary);
		System.out.println();
		
		
	}
}
