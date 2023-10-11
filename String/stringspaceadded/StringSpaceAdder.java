package com.kd.stringspaceadded;

public class StringSpaceAdder {
	public  String spaceAdder(String inputString) {
		char [] crr = inputString.toCharArray();
		char []c=new char[inputString.length()];
		for(int i=0;i<crr.length;i++) {
			if(crr[i]==' ') {
				c[i]=crr[i];
			}
				
		}System.out.println("After inserting the char ");
		int j=crr.length-1; {
		for(int i=0;i<c.length;i++)	
			if(crr[i]!=' ') {
				if(c[j]==' ') {
					j--;
				}else {
					c[j]=crr[i];
					j--;
				}
			}
		}
		return c.toString();
		
	}
}
