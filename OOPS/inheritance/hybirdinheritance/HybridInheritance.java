package com.kd.inheritance.hybirdinheritance;

import java.util.Scanner;

public class HybridInheritance {

	public static void main(String[] args) {
//		for engineer student class
		
		
		EngineerStudent es=new EngineerStudent();
		System.out.println("\n EngineerStudent \n ********** ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name = ");
		es.name=scan.next();
		System.out.println("Name = "+es.name);
		
//		for Medical Student  class
		
		
		MedicalStudent ms =new MedicalStudent();
		System.out.println("\n MedicalStudent \n ********** ");
		System.out.print("Enter the name = ");
		ms.name=scan.next();
		System.out.println("Name = "+ms.name);
		
		
//		for Java Trainer class
		
		
		JavaTrainer jt =new JavaTrainer();
		System.out.println("\n JavaTrainer \n ********** ");
		System.out.print("Enter the name = ");
		jt.name=scan.next();
		System.out.println("Name = "+jt.name);
		
//		for MySQL Trainer class
		
		
		MysqlTrainer my =new MysqlTrainer();
		System.out.println("\n MysqlTrainer \n ********** ");
		System.out.print("Enter the name = ");
		my.name=scan.next();
		System.out.println("Name = "+my.name);
		
//		release the resource
		
		scan.close();
		
		
		
	}

}
