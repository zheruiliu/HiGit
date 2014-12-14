package com.jerry.cc2;

public class ListUtil {
	public int[] generateArray(int n){
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = i;
		}
		int size = n;
		for(int i=0;i<n;i++){
			int num = (int)(Math.random()*size);
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
			size--;
		}
		return arr;
	}
	
	public Node createLinkList(int arr[]){
		if(arr == null || arr.length == 0){
			return null;
		}
		Node head = new Node(arr[0]);
		Node pre = head;
		for(int i=1;i<arr.length;i++){
			pre.next = new Node(arr[i]);
			pre = pre.next;
		}
		return head;
	}
	public void printNode(Node node){
		if(node == null){
			return;
		}
		while(node != null){
			System.out.print(node.val + " -> ");
			node = node.next;
		}
		System.out.println();
	}
}
