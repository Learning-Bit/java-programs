package com.kn.patterntypes;
// write a java program using pattern 
/*
1     
12    
123   
1234  
12345 */
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
