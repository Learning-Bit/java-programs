package com.kn.gcdusingrecurssive;

public class GcdUsingRecurssive {
	public int gcdOfGiveNumber(int input1,int input2) {
		System.out.println();
		if(input2 == 0) {
			return input1;
		}else {
			return gcdOfGiveNumber(input2, input1%input2);
		}
	}
}
