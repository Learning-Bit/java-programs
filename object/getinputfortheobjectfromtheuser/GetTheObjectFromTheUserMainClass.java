package com.kd.getinputfortheobjectfromtheuser;

import java.util.Scanner;

public class GetTheObjectFromTheUserMainClass {

	public static void main(String[] args) {
//		get the input form the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------");
		System.out.println("How many student objects to be created ? ");
		GetTheObjectFromTheUser [] srr= new GetTheObjectFromTheUser[scanner.nextInt()];
//		to get the object of the (gettheobjectfromtheuser) class
		for(int i=0;i<srr.length;i++) {
			System.out.print("Enter the "+i+" index values: ");
			srr[i]=new GetTheObjectFromTheUser(scanner.nextInt(), scanner.next(), scanner.nextInt());
		}
//		to display the object 
		for(int i=0;i<srr.length;i++) {
			System.out.println("ID = "+srr[i].id+" , Name = "+srr[i].name+" , marks = "+srr[i].marks);

		}
		scanner.close();
	}

}
