package com.jerry.cc1;

public class ReverseString {
	public static void main(String[] args){
		String s = "abcdefg";
		System.out.println(reverse(s));
	}
	public static String reverse(String s){
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length/2;i++){
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return new String(arr);
	}
}
