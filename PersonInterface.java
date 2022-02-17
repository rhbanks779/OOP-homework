package OOP;

import java.util.Scanner;

public interface PersonInterface {
	static final String companyName = "The Company";
	
	double calculate(int x, double y);
	double input();
	int objectCount(int count);
	double input(int x, double y);
	
 class PersonInterface1 implements PersonInterface{
	 
	 int x;
	 double y;
	 int count = 0;
	 
	 	public void open(String companyName) {
	 		System.out.println("Hello, the name of our group is " + companyName);
	 	}
		
		@Override
		public double input() {
			System.out.println("Enter first number:");
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
			
			
			System.out.println("Enter second number:");
			Scanner scan1 = new Scanner(System.in);
			y = scan1.nextDouble();
			
			
		}

		@Override
		public double calculate(int x, double y) {
			double sum = x + y;
			System.out.println("The sum of your numbers is "+ sum);
			return sum;
		}

		
		public double calculate2(int x, double y) {
			double times = x * y;
			System.out.println("Your multiplied total is "+ times);
			return times;
		}
		
		@Override
		public int objectCount(int count) {
			count++;
			System.out.println("The total object count is "+ count);
			return count++;
		}

		@Override
		public double input(int x, double y) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
}
