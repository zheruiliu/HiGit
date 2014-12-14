package com.jerry.nov;

public class TestTheadSleep {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i == 5){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
}
