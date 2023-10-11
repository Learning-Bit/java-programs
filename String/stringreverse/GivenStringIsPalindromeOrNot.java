package com.kd.stringreverse;

public class GivenStringIsPalindromeOrNot {
	//	to create a method for reverse string
	public  String reverseString(String inputString) {
//		create one string buffer to append the string of the char
		StringBuffer outputString = new StringBuffer();
//		create one boolean to the given string is palindrome or not
		boolean isPalindrome =false;

//		to reverse the processs
		for(int i=inputString.length()-1;i>=0;i--){
			outputString =outputString.append(inputString.charAt(i));
		}
		if(outputString.toString().equals(inputString)) {
			isPalindrome = true;
			if(isPalindrome) {
				System.out.println("The Given String is Palindrome "+isPalindrome);
			}
		}else {
			System.out.println("Given String is not a Palindrome");
		}
		
		return outputString.toString();
		
	}
}
