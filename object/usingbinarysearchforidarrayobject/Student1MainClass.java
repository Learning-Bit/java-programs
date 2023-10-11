package com.kd.usingbinarysearchforidarrayobject;

import java.util.Scanner;


public class Student1MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------");
		System.out.println("How many student objects to be created ? ");
		Student1 [] srr= new Student1[scanner.nextInt()];
//		to get the object of the (gettheobjectfromtheuser) class
		for(int i=0;i<srr.length;i++) {
			System.out.print("Enter the "+i+" index values: ");
			srr[i]=new Student1(scanner.nextInt(), scanner.next(), scanner.nextInt());
		}
//		using binary search
		int low=0,high=srr.length-1;
		boolean isElementsFount = false;
		int position =-1;
		int mid=0;
		System.out.println("-------------\n");
//		to get elements that need to searched 
		System.out.println("Enter the id to searched ");
		int elements = scanner.nextInt();
//		To check the given number 
		while(low<=high) {
			mid=(low+high)/2;
			if(elements == srr[mid].id) {
				isElementsFount = true;
				position = mid+1;
				break;
			}
			else if(elements>srr[mid].id) {
				low =mid+1;
//				high=high;
			}
			else  {
				high =mid-1;
//				low = low;
			}
		}
		if(isElementsFount) {
			System.out.println("ID = "+elements+" and the position = "+position);
		}
		else {
			System.out.println("ID = "+elements+" is not found ");

		}
		
//		close resources
		
		scanner.close();
	}

}
