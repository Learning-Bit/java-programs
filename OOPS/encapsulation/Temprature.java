package com.kd.encapsulation;

public class Temprature {
	private int temprature;

	public int getTemprature() {
		return temprature;
	}

	public void setTemprature(int temprature) {
		if(temprature >= 16 && temprature <=25 ) {
		this.temprature = temprature;
		}
	}
}
