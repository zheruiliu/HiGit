package com.jerry.cc1;

import java.util.Arrays;

public class DecideStringAnagram {
	public static void main(String[] args){
		String s1 = "abcdefg";
		String s2 = "edfgcba";
		System.out.println(checkAnagram(s1,s2));
		System.out.println(checkAnagram1(s1,s2));
	}
	
	public static boolean checkAnagram1(String s1,String s2){
		if(!(s1 != null && s2 != null) && s1.length() != s2.length()){
			return false;
		}
		int words[] = new int[256];
		for(int i=0;i<s1.length();i++){
			words[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++){
			if(words[s2.charAt(i)] == 0){
				return false;
			}
			words[s2.charAt(i)]--;
		}
		return true;
	}
	
	
	public static boolean checkAnagram(String s1, String s2){
		if(!(s1 != null && s2!= null) && s1.length() != s2.length()){
			return false;
		}
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
}
