package com.kd.anagramstring;

public class AnagramString {
//	create an method for the anagramString
	public boolean anagramStringUsingSort(String inputString,String inputString1) {
//		change the string into char array
		
		boolean isAnagram=false;
		if(inputString.length()==inputString1.length()) {
			char []crr1=inputString.toCharArray();
			char[] crr2=inputString1.toCharArray();
			crr1=sortCharacterArray(crr1);
			crr2=sortCharacterArray(crr2);
			for(int i=0;i<crr1.length;i++) {
			if(crr1[i]==(crr2[i])) {
				isAnagram=true;
			}else {
				isAnagram=false;
				break;
			}
		}
		}

		return isAnagram;
		
	}
//	create an another method to sort the char
	public char [] sortCharacterArray(char [] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean isSwaped = false;
			for(int j=0;j<arr.length-1-i;j++){
//				int fElements=arr[j],sElement=arr[j+1],tEelement;
				if(arr[j]>arr[j+1]) {
					char temp =0;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwaped = true;
				}
			}if(isSwaped==false) {
				break;
			}
		}
		return arr;
		
	}
}
