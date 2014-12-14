package com.jerry.cc2;

import java.util.Arrays;

public class NthToLastDeleteMid {
	public static void main(String[] args){
		ListUtil util = new ListUtil();
		int arr[] = util.generateArray(10);
		System.out.println(Arrays.toString(arr));
		Node root = util.createLinkList(arr);
		util.printNode(root);
		Node res = findNthLast(root,5);
		System.out.println();
		System.out.println(res.val);
		deleteMidNode(res);
		util.printNode(root);
		
		
	}
	
	public static void deleteMidNode(Node node){
		if(node == null || node.next == null){
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
	public static Node findNthLast(Node root,int num){
		Node cur = root;
		for(int i=0;i<num;i++){
			if(cur == null){
				break;
			}
			cur = cur.next;
		}
		Node pre = root;
		while(cur != null){
			pre = pre.next;
			cur = cur.next;
		}
		return pre;
	}
}
