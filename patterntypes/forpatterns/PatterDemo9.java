
package com.kn.forpatterns;

public class PatterDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=5;j>1;j++) {
				if(j>=(6-i)) {
					System.out.print(i);
				}
			}
			System.out.println(" ");
		}


	}

}
