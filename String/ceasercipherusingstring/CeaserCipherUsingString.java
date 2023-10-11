package com.kd.ceasercipherusingstring;

import java.util.Scanner;

public class CeaserCipherUsingString {
	public String cipherText(String inputString) {
		StringBuffer sb=new StringBuffer();
		char [] crr= inputString.toCharArray();
//		get the input from the user
//		start the resources
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to add");
		int n=scan.nextInt();
		for(int i=0;i<crr.length;i++) {
			if((crr[i]>=65 && crr[i]<=90-n)||(crr[i]>=97 && crr[i]<=122-n)) {
				crr[i]=(char)(crr[i]+n);
			} 
			else  {
				crr[i]=(char)(crr[i]+n-26);
			}
			
		}
		for(char c :crr) {
			sb=sb.append(c);
		}
		
//		leaving the resource
		scan.close();
		return sb.toString();
		
	}

}
