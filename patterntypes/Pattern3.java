package com.kn.patterntypes;
// write a java program using pattern
/*
 1     
12    
123   
1234  
12345 
1234  
123   
12    
1     
*/
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		for(i=1;i<=9;i++) {
			if(i<=5) {
				k++;
			}else {
				k--;
			}
			for(j=1;j<=5;j++) {
				if(j<=k) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
