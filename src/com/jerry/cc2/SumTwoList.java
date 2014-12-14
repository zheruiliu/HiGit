package com.jerry.cc2;



public class SumTwoList {
	public static void main(String[] args){
		ListUtil util = new ListUtil();
		int arr1[] = util.generateArray(10);
		int arr2[] = util.generateArray(10);
		Node root1 = util.createLinkList(arr1);
		Node root2 = util.createLinkList(arr2);
		util.printNode(root1);
		util.printNode(root2);
		Node res = calculate(root1,root2);
		util.printNode(res);
	}
	
	public static Node calculate(Node node1,Node node2){
		int carry = 0;
		Node fakeHead = new Node(0);
		Node pre = fakeHead;
		while(node1 != null || node2 != null || carry != 0){
			if(node1 != null){
				carry += node1.val;
				node1 = node1.next;
			}
			if(node2 != null){
				carry += node2.val;
				node2 = node2.next;
			}
			pre.next = new Node(carry%10);
			pre = pre.next;
			carry /= 10;
		}
		return fakeHead.next;
	}
}
