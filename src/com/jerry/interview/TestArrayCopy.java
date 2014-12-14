package com.jerry.interview;

import java.util.Arrays;

public class TestArrayCopy {
	public static void main(String[] args){
		int arr[] = {1,2,3};
		int ar[] = arr.clone();
		int a[] = new int[10];
		a = Arrays.copyOf(arr, arr.length-1);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(a));
		
	}
}
