package com.test.dec;

public class TestAppend {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		String s = "Jerry";
		sb.append(s,0,2);
		System.out.println(sb);
		sb.insert(0,"Tom");
		System.out.println(sb);
		double k = (double)0/-1;
		double k1 = (double)-1/0;
		System.out.println(k == 0);
		System.out.println(k1);
		System.out.println(Double.MAX_VALUE);
	}
}
