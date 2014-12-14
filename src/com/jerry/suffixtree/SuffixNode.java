package com.jerry.suffixtree;
import java.util.*;

public class SuffixNode {
	HashMap<Character,SuffixNode> children;
	List<Integer> indexes;
	public SuffixNode(){
		children = new HashMap<Character,SuffixNode>();
		indexes = new ArrayList<Integer>();
	}
	public void insert(String s,int index){
		//this is outsite s.length because need on more node on leaf, so find will get right position
		indexes.add(index);
		if(s != null && s.length() > 0){
			Character c = s.charAt(0);
			SuffixNode child = null;
			if(children.containsKey(c)){
				child = children.get(c);
			} else{
				child = new SuffixNode();
				children.put(c,child);
			}
			child.insert(s.substring(1), index);
		}
		
	}
	public List<Integer> getIndexes(String s){
		if(s == null || s.length() == 0){
			return indexes;
		}
		char c = s.charAt(0);
		if(children.containsKey(c)){
			SuffixNode child = children.get(c);
			return child.getIndexes(s.substring(1));
		}
		return null;
	}
	
}
