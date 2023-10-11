package com.kn.nestedifelse;
import java.util.Scanner;
/*Problem Statement 24: You're developing an interactive tool for a driving school. The tool takes a traffic light color (Red, Yellow, Green) as input and suggests the action a driver should take. The program should print "Stop" for "Red", "Ready" for "Yellow", and "Go" for "Green".*/
public class TrafficLightColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trafficLightColors();

	}

	static void trafficLightColors() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Signal in Traffic Light Color = ");
		String color=scan.next();
		if (color.equals("red")) {
			System.out.println("---> STOP <---");
		}else if(color.equals("yellow")) {
			System.out.println("---> READY <---");
		}else if(color.equals("green")) {
			System.out.println("---> GO <--- ");
		}else {
			System.out.println("<-- Its not a Traffic light color -->");
		}scan.close();
		
	}

}


/*Enter the Signal in Traffic Light Color = 
red
---> STOP <---
Enter the Signal in Traffic Light Color = 
green
---> GO <--- 
Enter the Signal in Traffic Light Color = 
yellow
---> READY <---


*/
