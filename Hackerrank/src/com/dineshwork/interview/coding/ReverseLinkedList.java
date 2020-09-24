package com.dineshwork.interview.coding;

import java.util.*;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		CustomerLinkedList  customLinkedList = new CustomerLinkedList();
		
		list.add(1);
		list.add(8);
		list.add(10);
		list.add(4);
		
		customLinkedList.add(1);
		customLinkedList.add(8);
		customLinkedList.add(10);
		customLinkedList.add(4);
		
		System.out.println("Before Reveresed: " + list);
		System.out.println("Before Reveresed: " + reversedEasy(list));
		
		System.out.println("==========================================");
		
		customLinkedList.traverse();
		System.out.println("Reveres ing the customer linked list...");
		customLinkedList.reverse();
		customLinkedList.traverse();
		
	}
	
	public static LinkedList<Integer> reversedEasy(LinkedList<Integer> original) {
		int length = original.size();		
		LinkedList<Integer> reversed = new LinkedList<>();
		
		for(int j=length -1 ; j >= 0;j--) {
			reversed.add(original.get(j));
		}
		
		return reversed;
	}	
	
		
}

class CustomerLinkedList {
	ListNode head;
	ListNode tail;
	
	public void add(int val) {
		ListNode newNode = new ListNode(val);

		if (head == null) {
			head = newNode;
		}

		if (tail != null) {
			tail.next = newNode;			
			newNode.previous = tail;
		}

		tail = newNode;
	}
	
	
	public int peek() {
		return head.data;
	}
	
	public ListNode getFist() {
		return head;
	}
	
	public ListNode getLast() {
		return tail;
	}
	
	public void reverse() {
		ListNode current = tail;
		
		while(current != head) {
			ListNode tmpNext = current.next;
			ListNode tmpPrev = current.previous;
			current.next = current.previous;
			current.previous = tmpNext;
			current = tmpPrev;
			
		}
		
		ListNode tmpHead = head;		
		head = tail;
		tail = tmpHead;
	}
	
	public void traverse() {
		ListNode current = head;
		
		while(current != tail) {
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println(current.data);
	}
}


class ListNode {
	int data;
	ListNode next;
	ListNode previous;

	public ListNode(int val) {
		this.data = val;
	}
}
 

