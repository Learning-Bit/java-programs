package com.kd.factorialusingrecurssive;

public class FactorialUsingRecurssive {
	public int factorialNumber(int input) {
		if(input==1) {
			return 1;
		}else{
			return input * factorialNumber(input-1);
		}
	}
}
