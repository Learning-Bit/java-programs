package com.kd.countvowelconsonantdigitspecialcharspacingivenstring;


public class CountVowelConsonantDigitSpecialCharSpacingGivenString {
	public  void countCharcter(String inputString) {
		char[] crr=inputString.toCharArray();
		int vowel1=0,vowel2=0;
		int consonant1=0,consonant2=0,space=0,special=0,digit=0;
		
		for(int i=0;i<crr.length;i++) {
//			System.out.println("upper case count");
			if(crr[i]>=65 && crr[i]<=90) {
				if(crr[i]=='A'||crr[i]=='I'||crr[i]=='O'||crr[i]=='U'||crr[i]=='E') {
					vowel1++;
				}else {
					consonant1++;
				}
//				System.out.println("lower case");
			}else if(crr[i]>=97 && crr[i]<=122) {
				if(crr[i]=='a'||crr[i]=='e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u') {
					vowel2++;
				}else {
					consonant2++;
				}
			}
			else if(crr[i]==32) {
				space++;
			}else if(crr[i]>=48 && crr[i]<=57) {
				digit++;
			}else{
				special++;
			}
		}
		System.out.println("Vowel = "+vowel1);
		System.out.println("Consotant = "+consonant1);
		System.out.println("Vowel = "+vowel2);					
		System.out.println("Consotant = "+consonant2);
		System.out.println("Space = "+space);
		System.out.println("Digit = "+digit);
		System.out.println("SpecilaCharacter = "+special);




	}
	}
