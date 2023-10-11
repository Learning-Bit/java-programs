package com.kd.countthegivenstringincharacter;

public class CountTheGivenStringInCharacter {	
	public  void countTheStringCharacter(String inputString) {
		char []crr=inputString.toCharArray();
		int count=1;
		crr=sortCharacterArray(crr);

		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr.length-1;j++) {
				if(crr[j]==crr[j+1]) {
					count=count+1;
				}else {
					System.out.println(crr[j]);
					System.out.println("count = "+count);
					count=1;

				}
				if(j+1==crr.length-1) {
					if(crr[j+1]==crr[j]) {
						count++;
					}else {
						System.out.println(crr[j+1]+count);
					}
				}
			}
		}
		
		
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
