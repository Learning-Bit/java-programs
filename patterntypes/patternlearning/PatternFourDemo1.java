package com.kn.patternlearning;
/* WAJP the program using pattern and the display the ouptut 
 12345 
1234- 
123-- 
12--- 
1---- */
public class PatternFourDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(j);
//					System.out.print(j);
				}else {
					System.out.print("-");
				}
			}
			System.out.println(" ");

		}

	}

}

/*
12345 
1234- 
123-- 
12--- 
1---- */