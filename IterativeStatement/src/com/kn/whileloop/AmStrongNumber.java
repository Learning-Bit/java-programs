package com.kn.whileloop;

//import java.util.Scanner;

public class AmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAmStrongNumber();

	}

	static void FindAmStrongNumber() {
		// TODO Auto-generated method stub
		int num,sum,temp,power;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your ArmStrong Number = ");
		num = 1;
		while(num<200) {
		temp=num;
		power =0;
		while(temp>0) {
			sum = temp%10;
			power = power+(sum*sum*sum);
			temp = temp /10;
			if(power == num) {
				System.out.println("ArmStrong Number = "+num);
				num++;
			
		}else {
			System.out.println("try again...");
		}
		}
//		else {
//			System.out.println("its is not armstrong number");
//
//		}
//		scan.close();
		}
	}

}
