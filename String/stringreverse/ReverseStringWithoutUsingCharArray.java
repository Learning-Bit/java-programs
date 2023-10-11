 package com.kd.stringreverse;

public class ReverseStringWithoutUsingCharArray {
	//	to create a method for reverse string
	public  String reverseString(String inputString) {
//		create one string buffer to append the string of the char
		StringBuffer outputString = new StringBuffer();

//		to reverse the processs
		for(int i=inputString.length()-1;i>=0;i--){
			outputString =outputString.append(inputString.charAt(i));
		}
			
		
		return outputString.toString();
		
	}
}
