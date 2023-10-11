package com.kd.inheritance.heirarchalinheritance;

import java.util.Scanner;

public class Heirarchalnheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		for employee class
		Employee e = new Employee();
		System.out.println("\n Employee \n ************ \n");
		System.out.print("Enter the name = ");
		e.name=scan.next();
		System.out.print("Enter the salary = ");
		e.salary=scan.nextDouble();
		System.out.println("Name = "+e.name);
		System.out.println("Salary = "+e.salary);
		
		
//		for developer class
		Developer d = new Developer();
		System.out.println("\n Developer \n ************ \n");
		System.out.print("Enter the name = ");
		d.name=scan.next();
		System.out.print("Enter the salary = ");
		d.salary=scan.nextDouble();
		System.out.println("Name = "+d.name);
		System.out.println("Salary = "+d.salary);
		
		
//		for TestEngineer class
		TestEngineer t = new TestEngineer();
		System.out.println("\n TestEngineer \n ************ \n");
		System.out.print("Enter the name = ");
		t.name=scan.next();
		System.out.print("Enter the salary = ");
		t.salary=scan.nextDouble();
		System.out.println("Name = "+t.name);
		System.out.println("Salary = "+t.salary);
		
		
//		for Manager class
		Manager m = new Manager();
		System.out.println("\n Manager \n ************ \n");
		System.out.print("Enter the name = ");
		m.name=scan.next();
		System.out.print("Enter the salary = ");
		m.salary=scan.nextDouble();
		System.out.println("Name = "+m.name);
		System.out.println("Salary = "+m.salary);
		
		
//		for TeamLead class
		TeamLead tl = new TeamLead();
		System.out.println("\n TeamLead \n ************ \n");
		System.out.print("Enter the name = ");
		tl.name=scan.next();
		System.out.print("Enter the salary = ");
		tl.salary=scan.nextDouble();
		System.out.println("Name = "+tl.name);
		System.out.println("Salary = "+tl.salary);
		
//		to close the resources

		scan.close();


	}

}
