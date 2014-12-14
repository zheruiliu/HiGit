package com.jerry.trie;
import java.util.*;

public class TrieNode {
	char value;
	List<TrieNode> children;
	
	public TrieNode(){
		children = new LinkedList<TrieNode>();
	}
	
	public TrieNode(char c){
		this();
		this.value = c;
	}
	
	public void addWord(String s){
		char c = s.charAt(0);
		TrieNode child = getChild(c);
		if(s.length() > 1){
			child.addWord(s.substring(1));
		}
	}
	
	public TrieNode getNode(char c){
		for(TrieNode child : children){
			if(child.value == c){
				return child;
			}
		}
		return null;
	}
	
	private TrieNode getChild(char c){
		TrieNode retNode = getNode(c);
		if(retNode != null){
			return retNode;
		}
		TrieNode node = new TrieNode(c);
		children.add(node);
		return node;
	}
	
}
