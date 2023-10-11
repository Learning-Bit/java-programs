package com.kd.stringcreation;

public class StringMethods {

	public static void main(String[] args) {
//		given data will be uppercase
		String s1 = " rama chandran  ";
		String s2 = "priya";
		String s3 ="raja ram mohan roy";
		System.out.println("data that convert into uppercase");
		System.out.println("s1 = " + s1.toUpperCase());
		System.out.println("--------");
		System.out.println("data that convert into lowercase");
		System.out.println("s1 = " + s1.toLowerCase());
		System.out.println("--------");
		System.out.println("Retruns the character at specifiedd index");
		System.out.println("s1 = " + s1.charAt(2));
		System.out.println("--------");
		System.out.println("Retruns index value for first occurance of specifiedd character");
		System.out.println("s1 = " + s1.indexOf('a')); // start
		System.out.println("--------");
		System.out.println("Retruns index value for last occurance of specifiedd character");
		System.out.println("s1 = " + s1.indexOf('i')); // last
		System.out.println("--------");
		System.out.println("Retruns string starting from  specified index");
		System.out.println("s1 = " + s1.substring(2)); // inclusive
		System.out.println("--------");
		System.out.println("Retruns string starting from end  specified index");
		System.out.println("s1 = " + s1.substring(2, 5)); // inclusive and exclusive
		System.out.println("--------");
		System.out.println("Retruns string if the word is contains or not ");
		System.out.println("s1 = " + s1.contains("iya")); // inclusive and exclusive
		System.out.println("--------");
		System.out.println("Define the lenght of the Strings ");
		System.out.println("s1 = " + s1.length()); // inclusive and exclusive
		System.out.println("--------");
		System.out.println("Define the given string is startWiths the given data or not ");
		System.out.println("s1 = " + s1.startsWith("p")); 
		System.out.println("--------");
		System.out.println("Define the given string is endsWiths the given data or not ");
		System.out.println("s2 = " + s2.endsWith("ya"));   
		System.out.println("--------");
		System.out.println("Define the given string is convert into new chararray ");
		char [] crr=s2.toCharArray();
		for(int i=0;i<crr.length;i++) {
			System.out.print(crr[i]+" ");
		}
		System.out.println("--------");
		System.out.println("Returns a string whose value is this string, with all leadingand trailing space removed, where space is definedas any character whose codepoint is less than or equal to 'U+0020' (the space character).");
		System.out.println("********");
		System.out.println("s1 = "+s1);
		System.out.println("********");
		System.out.println(s1.trim()); 	
		System.out.println("--------");
		System.out.println("return the spereate string using the delimiter of the specified string ");
		System.out.println("********");
		System.out.println("s1 = "+s1);
		System.out.println("********");
		System.out.println(s3.split(" ")); 	
		System.out.println("--------");

	}

}

//output
/*
 * data that convert into uppercase s1 = PRIIYA -------- data that convert into
 * lowercase s1 = priiya -------- Retruns the character at specifiedd index s1 =
 * i -------- Retruns index value for first occurance of specifiedd character s1
 * = 5 -------- Retruns index value for last occurance of specifiedd character
 * s1 = 2 -------- Retruns string starting from specified index s1 = iiya
 * -------- Retruns string starting from end specified index s1 = iiy --------
 * Retruns string if the word is contains or not s1 = true --------
 */
