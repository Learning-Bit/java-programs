package com.kd.inheritance2;

public class RobotMainClass {

	public static void main(String[] args) {
		DriveRobot dr=new DriveRobot();
		System.out.println("name = "+dr.name); 
		System.out.println("type = "+dr.type); 
		dr.walk();
		dr.talk();
		dr.charge();
		dr.drive();
		ChiefRobot cr = new ChiefRobot();
		System.out.println("Name = "+cr.name);
		System.out.println("Type = "+cr.type);
		cr.walk();
		cr.talk();
		cr.charge();
		cr.cook();
		
	}

}
