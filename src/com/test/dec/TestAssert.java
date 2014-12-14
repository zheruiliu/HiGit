package com.test.dec;

public class TestAssert {
	public static void main(String[] args){
		String list = "a";
		assert list != null && list.length() > 0 : "list variable is null or empty";
	}
}
