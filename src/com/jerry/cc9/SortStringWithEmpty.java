package com.jerry.cc9;

import java.util.Arrays;

public class SortStringWithEmpty {
	public static void main(String[] args){
		String arr[] = {"apple","","banana","","","efff","","flag","","jerry",""};
		System.out.println(Arrays.toString(arr));
		System.out.println(search(arr,"apple"));
		System.out.println(search(arr,"banana"));
		System.out.println(search(arr,""));
		System.out.println(search(arr,"jerry"));
		System.out.println(search(arr,"flag"));
	}
	public static int search(String arr[],String target){
		if(arr == null || arr.length == 0){
			return -1;
		}
		if(target.length() == 0){
			int i = 0;
			while(arr[i].length() != 0){
				i++;
			}
			if(i == arr.length){
				return -1;
			}
			return i;
		}
		int left = 0;
		int right = arr.length-1;
		while(left < right){
			while(left <= right && arr[right].length() == 0){
				right--;
			}
			if(arr[right].length() == 0){
				return -1;
			}
			int mid = (left+right)/2;
			while(arr[mid].length() == 0){
				mid++;
			}
			String str = arr[mid];
			if(target.equals(str)){
				return mid;
			}
			if(target.compareTo(str) < 0){
				right = mid - 1;
			} else{
				left = mid + 1;
			}
		}
		return -1;
	}
}
