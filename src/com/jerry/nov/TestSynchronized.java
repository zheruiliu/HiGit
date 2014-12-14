package com.jerry.nov;

public class TestSynchronized {
	private Object obj;
	public synchronized void setObject(Object o){
		obj = o;
	}
	public void change(Object o){
		synchronized(obj){
			obj = o;
		}
	}
	public void lock(){
		synchronized(this){
			System.out.println("lock");
			
		}
	}
}
