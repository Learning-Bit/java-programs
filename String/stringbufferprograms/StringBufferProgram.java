package com.kd.stringbufferprograms;

public class StringBufferProgram {

	public static void main(String[] args) {
//		to create a StringBuffer
		StringBuilder sb1= new StringBuilder("Raja ram moham ");
		System.out.println(" before append");
		System.out.println("sb1 = "+sb1);
		System.out.println("sb1 length "+sb1.length());
		System.out.println("sb1 capacity "+sb1.capacity());


//		to append the string 
		sb1.append("roy");
		System.out.println("******************");
		System.out.println();
		System.out.println("After Append ");
		System.out.println("sb1 = "+sb1);
		System.out.println("sb1 lenght "+sb1.length());
		System.out.println("sb1 capacity "+sb1.capacity());
//		to append the string 
		System.out.println("******************");
		System.out.println();
		sb1.append(" the of best freedom fighter in the india. ");
		System.out.println("After Append ");
		System.out.println("sb1 = "+sb1);
		System.out.println("sb1 lenght "+sb1.length());
		System.out.println("sb1 capacity "+sb1.capacity());

	}

}
