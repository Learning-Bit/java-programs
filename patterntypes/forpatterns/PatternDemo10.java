package com.kn.forpatterns;

public class PatternDemo10 {
	public static void main(String []args) {
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=5;j>=1;j--) {
				if(i>=j) {
					System.out.print(i);

					//					System.out.print((char)(70-i));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
