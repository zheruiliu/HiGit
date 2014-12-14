package com.jerry.cc1;

import java.util.Arrays;

public class ReplaceStringSpace {
	public static void main(String[] args){
		String s = "ab d e m";
		System.out.println(s.replace(" ", "%20"));
		char arr[] = new char[50];
		arr[0] = '1';
		arr[1] = ' ';
		arr[2] = 'm';
		arr[3] = ' ';
		System.out.println(Arrays.toString(arr));
		replaceSpace(arr,4);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void replaceSpace(char arr[], int length){
		int count = 0;
		for(int i=0;i<length;i++){
			if(arr[i] == ' '){
				count++;
			}
		}
		int newEnd = length + count*2 - 1;
		for(int i=length-1;i>=0;i--){
			if(arr[i] == ' '){
				arr[newEnd] = '0';
				arr[newEnd-1] = '2';
				arr[newEnd-2] = '%';
				newEnd -= 3;
			} else{
				arr[newEnd--] = arr[i];
			}
		}
	}
}
