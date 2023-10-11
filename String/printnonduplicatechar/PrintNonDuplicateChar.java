package com.kd.printnonduplicatechar;

public class PrintNonDuplicateChar {
	public  void duplicateCharCheck(String inputString) {
		char []crr=inputString.toCharArray();
		int count=0;
		crr=sortCharacterArray(crr);
		int j=crr.length-1;

		for(int i=0;i<crr.length;i++) {
			
				if(crr[i]==crr[j]) {
					j++;
				}else {
					count=1;
				}
			}if(count==1) {
				System.out.println(crr[j]);
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
