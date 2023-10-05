package com.kn.patternlearning;
/* WAJP the pattern and print 
*---- 
**--- 
***-- 
****- 
***** */
public class PatternThirdDemo1 {
	public static void main(String []args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i>=j) {
//					System.out.print("*");
//					System.out.print(j);
					System.out.print(i);
				}else {
					System.out.print("-");
				}
			}
			System.out.println(" ");

		}

	}

}


// output

/*
 *---- 
**--- 
***-- 
****- 
***** */
