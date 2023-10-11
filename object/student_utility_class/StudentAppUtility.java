package com.kd.student_utility_class;

import java.util.Scanner;
public class StudentAppUtility {
	
	
	public StudentAppUtility[]  studentObjectCreated() {
		Scanner scan = new Scanner(System.in);
		 StudentAppUtility[] srr = new StudentAppUtility[scan.nextInt()];

		for(int i=0;i<srr.length;i++) {
			System.out.println("----- enter the "+i+" index values \n ");
			
			System.out.print("Enter the id = ");
			int id = scan.nextInt();
			System.out.println("Enter the name = ");
			String name = scan.next();
			System.out.println("Enter the marks = ");
			int marks = scan.nextInt();
			
			System.out.println("\n");
			srr[i] = new StudentAppUtility(id, name, marks);
		}
		return srr;
		
	}
	public void searchStudentBasedOnId(StudentAppUtility[] srr) {
		int position =-1;
		int low =0,high=srr.length-1,mid=0;
		boolean isSearch = false;
		int ID = scan.nextInt();
		while(low<=high) {
			mid =(low+high)/2;
			if(ID == srr[mid].id) {
				isSearch=true;
				position = mid+1;
				break;
			}else if(ID >srr[mid].id) {
				low = mid +1;
				
			}else {
				high = mid -1;
			}
		}
		if(isSearch) {
			System.out.println("ID = "+ID+" is found "+" , and position is = "+position);
		}else {
			System.out.println("ID = "+ID+" is not found "+" , and position is = "+position);

		}
	}
}
