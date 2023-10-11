package com.kd.stringcreation;

public class StringComparison3 {

	public static void main(String[] args) {
		String s1 ="ram";
		String s2 ="sita";
		String s3 ="ram"+"sita";
		String s4 ="ram"+"sita";
		String s5= s1+s2;
		String s6 =s1+s2;
		String s7 =s3;
//		to reference checking 
		if(s3==s4) {
			System.out.println("Reference code is same ");
		}else {
			System.out.println("Different reference code");
		}
//		for data checking
		if(s3.equals(s4)) {
			System.out.println("Data are same ");
		}else {
			System.out.println("Data are different");
		}
//		to reference checking 
		/*when ever to string will be concatenate using string data ,the newly created object will be stored in string pool[dublicates or not allowed]
		 * when ever the string concatenate happen using reference the newly created object will be within heap outside of the string pool[dublicate are allowed]
		 */
		if(s5==s6) {
			System.out.println("Reference code is same ");
		}else {
			System.out.println("Different reference code");
		}
//		for data checking
//		what ever in the s3 have ,it will be put into the s7 [address of the s3]
		System.out.println("Without using concatenate even even store the reference data using the reference address of the heap memeory");
		if(s5.equals(s6)) {
			System.out.println("Data are same ");
		}else {
			System.out.println("Data are different");
		}
		if(s7==s3) {
			System.out.println("Reference code is same ");
		}else {
			System.out.println("Different reference code");
		}
//		for data checking
		if(s7.equals(s3)) {
			System.out.println("Data are same ");
		}else {
			System.out.println("Data are different");
		}
	}

}
