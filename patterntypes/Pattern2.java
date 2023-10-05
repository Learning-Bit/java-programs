package com.kn.patterntypes;

//write a java program using pattern 
/*
1     
22    
333   
4444  
55555  */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
