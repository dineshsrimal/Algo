package com.dineshwork.datastructure;

import java.util.LinkedList;
import java.util.Stack;

public class CustomStack<E> {
	
	private LinkedList<E> content;
	
	public CustomStack() {
		this.content = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> sdkStack = new Stack<>();
		sdkStack.push(10);
		sdkStack.push(12);
		sdkStack.push(15);
		
		int stackSize = sdkStack.size();
		
		for(int i=0; i < stackSize; i++) {
			System.out.println("Pop element from sdk stack: " + sdkStack.pop());
		}
		
		//------------------Customer Stack-------
		
		CustomStack<Integer> customStack = new CustomStack<>();
		customStack.push(10);
		customStack.push(12);
		customStack.push(15);
		
		int customStackSize = customStack.size();
		
		for(int i=0; i < customStackSize; i++) {
			System.out.println("Pop element from custom stack: " + customStack.pop());
		}	
		
	}
	
	/***
	 * add element to top
	 * @param e
	 */
	public void push(E e) {
		content.add(e);
	}
	
	/***
	 * remove element from top
	 * @return
	 */
	public E pop() {		
		return content.removeLast();
	}
	
	public E peek() {
		return content.getLast();
	}
	
	public int size() {
		return this.content.size();
	}

}


