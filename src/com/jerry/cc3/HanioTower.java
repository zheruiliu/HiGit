package com.jerry.cc3;

public class HanioTower {
	public static void main(String[] args){
		printHanioPath(3,"Tower1","Tower2","Tower3");
	}
	public static void printHanioPath(int n,String from,String buf,String end){
		if(n == 0){
			return;
		}
		printHanioPath(n-1,from,end,buf);
		System.out.println(from + " -> " + end);
		printHanioPath(n-1,buf,from,end);
	}
}
