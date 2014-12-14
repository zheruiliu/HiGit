package com.jerry.cc1;

public class StringUniqueCharacter {
	public static void main(String[] args){
		String s = "abdsee";
		String s1 = "abdse1";
		System.out.println(checkUnique(s));
		System.out.println(checkUnique(s1));
	}
	
	public static boolean checkUnique(String s){
		boolean words[] = new boolean[256];
		for(int i=0;i<s.length();i++){
			if(words[s.charAt(i)]){
				return false;
			}
			words[s.charAt(i)] = true;
		}
		return true;
	}
}
