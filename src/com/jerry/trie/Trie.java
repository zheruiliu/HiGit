package com.jerry.trie;

public class Trie {
	TrieNode root;
	
	//constructor with list
	public Trie(String[] list){
		root = new TrieNode();
		for(String s : list){
			if(s != null && s.length() > 0){
				root.addWord(s);
			}
		}
	}
	
	//check if prefix String is in trie
	public boolean contains(String prefix){
		TrieNode cur = root;
		for(int i=0;i<prefix.length();i++){
			char c = prefix.charAt(i);
			cur  = cur.getNode(c);
			if(cur == null){
				return false;
			}
		}
		return true;
	}
}
