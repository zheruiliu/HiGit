package com.jerry.cc1;

public class SubString {
	public static void main(String[] args){
		String s1 = "apple";
		String s2 = "pleap";
		System.out.println(isRotate(s1,s2));
	}
	
	public static boolean isRotate(String s1,String s2){
		if(s1 == null || s2 == null || s1.length() != s2.length()){
			return false;
		}
		String s11 = s1 + s1;
		if(s11.contains(s2)){
			return true;
		}
		return false;
	}
}
