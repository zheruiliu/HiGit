package com.jerry.cc1;

public class RemoveDucplicate {
	public static void main(String[] args){
		String s = "abcdaadeffaioc";
		String sNew = removeDuplicate(s);
		System.out.println(sNew);
		String sNew2 = removeDuplicate2(s);
		System.out.println(sNew2);
		
		String sNew3 = removeDuplicate3(s);
		System.out.println(sNew3);

	}
	
	public static String removeDuplicate3(String s){
		boolean hit[] = new boolean[256];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(!hit[c]){
				sb.append(c);
				hit[c] = true;
			}
		}
		return sb.toString();
	}
	
	public static String removeDuplicate2(String s){
		if(s == null || s.length() == 0){
			return s;
		}
		char arr[] = s.toCharArray();
		int end = 1;
		for(int i=1;i<arr.length;i++){
			int j = 0;
			for(;j<end;j++){
				if(arr[j] == arr[i]){
					break;
				}
			}
			if(j == end){
				arr[end] = arr[i];
				end++;
			}
		}
		return new String(arr,0,end);
	}
	
	
	public static String removeDuplicate(String s){
		if(s == null || s.length() == 0){
			return s;
		}
		StringBuffer sb = new StringBuffer();
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++){
			int j = 0;
			for(;j<sb.length();j++){
				if(sb.charAt(j) == s.charAt(i)){
					break;
				}
			}
			if(j == sb.length()){
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
