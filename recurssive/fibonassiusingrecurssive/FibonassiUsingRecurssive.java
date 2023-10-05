package com.kd.fibonassiusingrecurssive;

public class FibonassiUsingRecurssive {
	public int fibonassi(int input) {
		if(input<=1) {
			return 1;
		}else {
			return fibonassi(input-1)+fibonassi(input-2);
		}
	}
}
