package com.kd.stringvalindorinvalid;

public class GivenStringCheckValidOrInvalid {
	public void stringChecking(String input) {
		int paranthesis = 0, curly = 0, square = 0;
		char[] crr = input.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == '(') {
				paranthesis++;
			} else if (crr[i] == ')') {
				paranthesis --;
			} else if (crr[i] == '{') {
				curly++;
			} else if (crr[i] == '}') {
				curly--;;
			} else if (crr[i] == '[') {
				square++;
			} else if (crr[i] == ']') {
				square --;
			}
		} if(paranthesis==0 && square==0 && curly==0) {
			System.out.println("The given string is valid");
		}else {
			System.out.println("The given string is invalid");
		}

	}
}
