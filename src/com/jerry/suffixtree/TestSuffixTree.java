package com.jerry.suffixtree;
import java.util.*;

public class TestSuffixTree {
	public static void main(String[] args){
		String testString = "mississippi";
        String[] stringList = {"is", "sip", "hi", "sis","mi","miss","i","w"};
        SuffixTree tree = new SuffixTree(testString);
        for(String s : stringList){
        	List<Integer> list = tree.find(s);
        	System.out.println(s + ": " + list);
        }
	}
}
