package com.kd.giventhestringuniquecharcter;

public class GivenTheStringUniqueCharcter {
	public  String isCount(String s1) {
		char [] crr=s1.toCharArray();
		int count =0;
		for(int i=0;i<crr.length;i++) {
			for(int j=i+1;j<crr.length-1;i++) {
				if(crr[i]==crr[j]) {
					count=count+1;
				}
			}if(count==1) {
				System.out.println(crr[i]);
			}
			}
		return s1;
		
		
	

	}
}
