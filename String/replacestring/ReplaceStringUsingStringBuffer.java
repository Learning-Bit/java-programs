package com.kd.replacestring;

public class ReplaceStringUsingStringBuffer {
	public String replaceString(String inputString) {
		StringBuffer replaceBuffer = new StringBuffer(inputString);
			for(int i=0;i<replaceBuffer.length();i++) {
				if(replaceBuffer.charAt(i)==' ') {
					replaceBuffer.setCharAt(i, '$');
				}
			}
		return replaceBuffer.toString();
	}
}
