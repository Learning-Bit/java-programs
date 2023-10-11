package com.kd.objectcallingusingarray;


public class StudentMainClass {

	public static void main(String[] args) {
//		create an object for the student class
		Student s1 = new Student(1, "Amit", 75);
		Student s2 = new Student(2, "Diya", 20);
		Student s3 = new Student(3, "Priya", 55);
		
//		create a array for the student datatype that what we have created;
		System.out.println("Enter the size of the array ");
		Student[] srr= new Student[3];
		
		srr[0] = s1;
		srr[1] = s2;
		srr[2] = s3;
		
//		for(int i=0 ;i<srr.length;i++) {
//			if(srr[i].name.equals("Amit")) {
//			System.out.println("ID = "+srr[i].id+" , Name = "+srr[i].name+" , marks = "+srr[i].marks);
//		}
//		}
//		for(int i=0 ;i<srr.length;i++) {
//			if(srr[i].marks <=30) {
//				System.out.println("<----- After Grace ---->");
//				
//				System.out.println("Existing Marks = "+srr[i].marks);
//				srr[i].marks = 35;
//				System.out.println("<----- After Grace ---->");
//			System.out.println("Upgraded Marks = " +srr[i].marks);
//		}
//		}
		
//		bubble sorting
		for(int i=0;i<srr.length;i++) {
				boolean isSwaped = false;
				for(int j=0;j<srr.length-1-i;j++){
					if(srr[j].marks > srr[j+1].marks) {
						Student temp = srr[j];
						srr[j]=srr[j+1];
						srr[j+1]=temp;
						isSwaped = true;
					}

				}
				if(isSwaped == false) {
					break;
				}

			}
		for(int i=0;i<srr.length;i++) {
			System.out.println("ID = "+srr[i].id+" , Name = "+srr[i].name+" , marks = "+srr[i].marks);
		}
		
		
	}

}
