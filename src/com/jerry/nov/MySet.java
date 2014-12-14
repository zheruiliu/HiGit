package com.jerry.nov;
import java.util.*;

public class MySet<E> {
	private HashMap<E,Object> hm;
	private static final Object PRESENT = new Object();
	
	public MySet(){
		hm = new HashMap<E,Object>();
	}
	public boolean add(E e){
		return hm.put(e, PRESENT) == null;
	}
	public boolean remove(E e){
		return hm.remove(e) != null;
	}
}
