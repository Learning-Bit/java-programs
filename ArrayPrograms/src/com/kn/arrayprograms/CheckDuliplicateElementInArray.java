package com.kn.arrayprograms;

public class CheckDuliplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array declaration and creation 
		int []arr= {10,20,30,10,40};
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					k=j;
					break;
				}
			}
		}
		System.out.println(arr[k]);


	}

}
