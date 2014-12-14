package com.jerry.cc2;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args){
		int arr[] = {1,3,2,1,2,4,5,6,2,1};
		ListUtil ut  = new ListUtil();
		Node node = ut.createLinkList(arr);
		ut.printNode(node);
		System.out.println();
		removeDup(node);
		ut.printNode(node);
//		System.out.println();
//		removeDup1(node);
//		printNode(node);
	}
	
	public static void removeDup1(Node root){
		if(root == null){
			return;
		}
		Node cur = root;
		Node preRun = null;
		Node curRun = null;
		while(cur != null){
			preRun = cur;
			curRun = cur.next;
			while(curRun != null){
				if(curRun.val == cur.val){
					preRun.next = curRun.next;
				} else{
					preRun = curRun;
				}
				curRun = curRun.next;
			}
			cur = cur.next;
		}
	}
	
	public static void removeDup(Node root){
		HashSet<Integer> hs = new HashSet<Integer>();
		Node cur = root.next;
		Node pre = root;
		hs.add(root.val);
		while(cur != null){
			if(hs.contains(cur.val)){
				pre.next = cur.next;
			} else{
				hs.add(cur.val);
				pre = cur;
			}
			cur = cur.next;
		}
	}
	

}
