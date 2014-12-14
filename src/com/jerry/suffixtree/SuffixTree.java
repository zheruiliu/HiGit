package com.jerry.suffixtree;
import java.util.*;

public class SuffixTree {
	public SuffixNode root;
	public SuffixTree(String str){
		root = new SuffixNode();
		for(int i=0;i<str.length();i++){
			String s = str.substring(i);
			root.insert(s,i);
		}
	}
	public List<Integer> find(String s){
		return root.getIndexes(s);
	}
}
