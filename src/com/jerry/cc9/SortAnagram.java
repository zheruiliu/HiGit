package com.jerry.cc9;

import java.util.Arrays;
import java.util.*;

public class SortAnagram {
	public static void main(String[] args){
		String s[] = {"acb","edfe","cba","ef","feed"};
		System.out.println(Arrays.toString(s));
		sort(s);
		System.out.println(Arrays.toString(s));		
	}
	public static void sort(String[] arr){
		Arrays.sort(arr,new Comparator<String>(){
			public int compare(String s1,String s2){
				char[] arr1 = s1.toCharArray();
				char[] arr2 = s2.toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				String s1New = new String(arr1);
				String s2New = new String(arr2);
				return s1New.compareTo(s2New);
			}
		});
	}
}
