package OOP;
import java.util.Scanner;

import OOP.PersonInterface.PersonInterface1;

public class Starter {
	
	public static void main(String[] args) {
		
			
		Person p1 = new Person(null, null, 0);
		Person p2 = new Person( null, null, 0);
		Employee e1= new Employee(null, null, 0,0 ,0);
		Employee e2= new Employee(null, null, 0,0 ,0);
		Students s1 = new Students(null, null, 0, null, 0,0,0);
		Students s2 = new Students(null, null, 0, null, 0,0,0);
		
		Person1 per1 = new Person1(null, null, 0);
		
		per1.getFname();
		per1.getLname();
		per1.getAge();
		per1.display();
		
		PersonInterface1 pi1 = new PersonInterface1();
		pi1.open("The Company");
//		pi1.input();
		pi1.calculate(10,25);
		pi1.calculate2(3, 3);
		pi1.objectCount(0);
		
		p1.userInfo();
		p1.Hello();
		p1.display();
		p2.userInfo();
		p2.Hello();
	    p2.display();
		
		e1.userInfo();
		e1.display2();
		e2.userInfo();
		e2.display2();
		
		s1.userInfo();
		s1.display3();
		s2.userInfo();
		s2.display3();
	}

}
