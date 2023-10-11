package com.kd.inheritance.multilevelinheritace;

public class MultiLevelInheritance {

	public static void main(String[] args) {
//		for Vehicle Class
		Vehicle v = new Vehicle();
		v.reg_No=123;
		System.out.println("Reg:No: = "+v.reg_No);
		String s = v.move();
		System.out.println("Vehicle..."+s);
		System.out.println("\n *********** \n");
//		for Car class
		Car c = new Car();
		c.reg_No=789;
		System.out.println("Reg:No: = "+c.reg_No);
		String c1 = c.move();
		System.out.println("Car..."+c1);
		System.out.println("\n *********** \n");

//		for Sedan Class
		Sedan d = new Sedan();
		d.reg_No=456;
		System.out.println("Reg:No: = "+d.reg_No);
		String se = d.move();
		System.out.println("Vehicle..."+se);
	}

}
