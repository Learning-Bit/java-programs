package com.kd.stringreverse;

public class ReverseString {
	//	to create a method for reverse string
	public  String reverseString(String inputString) {
//		create one string buffer to append the string of the char
		StringBuffer outputString = new StringBuffer();
//		to convert the given string into charofarray for the reverse process
		char [] crr= inputString.toCharArray();
//		to reverse the processs
		for(int i=crr.length-1;i>=0;i--){
			outputString =outputString.append(crr[i]);
		}
			
		
		return outputString.toString();
		
	}
}
