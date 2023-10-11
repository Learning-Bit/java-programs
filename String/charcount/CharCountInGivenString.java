package com.kd.charcount;

import java.util.Scanner;

public class CharCountInGivenString {
	public  String isCount(String s1) {
		StringBuffer outputString = new StringBuffer(" ");
		Scanner scan = new Scanner(System.in);
		char [] crr=s1.toCharArray();
		System.out.println("Enter the charcter to check");
		char ch=scan.next().charAt(0);
		int count =0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]==ch) {
				count=count+1;
			}
			if(count==1) {
				outputString.append(crr[i]);
			}
			
		}
		scan.close();
		return outputString.toString();
		
	

	}
}
