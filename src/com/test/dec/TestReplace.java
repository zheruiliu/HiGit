package com.test.dec;
import java.util.*;
public class TestReplace {
	public static void main(String[] args){
		String s = "HelloJerryello";
		System.out.println(s.replaceAll("ell", "A"));
		System.out.println(s.replace("ell", "A"));
		System.out.println(s.replaceAll("H.ll", "A"));
		System.out.println(s.replace("H.ll", "A"));
		
		String arr[] = {"adee","bbd","aa","abc","1111"};
		Arrays.sort(arr,new Comparator<String>(){
			public int compare(String s1,String s2){
				return s1.length() - s2.length();
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}
