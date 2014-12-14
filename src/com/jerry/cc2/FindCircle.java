package com.jerry.cc2;

public class FindCircle {
	public static void main(String[] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n4;
		System.out.println(findCircleBegin(n1).val);
	}
	
	public static Node findCircleBegin(Node head){
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				break;
			}
		}
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
