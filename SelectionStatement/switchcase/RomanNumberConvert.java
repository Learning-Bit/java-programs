package com.kn.switchcase;
// program 23
import java.util.Scanner;

public class RomanNumberConvert {

	public static void main(String[] args) {
		
		RomanNumeral();
	
	}

	static void RomanNumeral() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter yoru romanNumeral = ");
		String roman = scan.next();
		String m ="I";
		String n="II";
		String o ="III";
		String p ="IV";
		String q = "V";
		if(roman == m) {
			System.out.println("1");
		}else if(roman == n) {
			System.out.println("2");
		}
		else if(roman == o) {
			System.out.println("3");
		}
		else if(roman == p) {
			System.out.println("4");
		}else if(roman == q) {
			System.out.println("5");
		}else {
			System.out.println("not  a given romannumeral--->");
		}
		scan.close();
//		return roman;
	}

	}
