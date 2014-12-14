package com.jerry.nov;

public class TestMySet {
	public static void main(String[] args){
		MySet<String> set = new MySet<String>();
		set.add("Aaa");
		set.add("bbbb");
		System.out.println(set.add("Aa"));
		
		MySet<Integer> set2 = new MySet<Integer>();
		set2.add(1);
		set2.add(2);
//		set2.remove(1);
		System.out.println(set2.remove(1));
		
	}
}
