package com.dineshwork.datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomQueue<E> {
	
	LinkedList<E> queueContent;
	
	public CustomQueue() {
		this.queueContent = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		
		Queue<Integer> jdkQueue = new PriorityQueue<>();		
		jdkQueue.add(10);
		jdkQueue.add(12);
		jdkQueue.add(15);
	
		int jdkQueueLength = jdkQueue.size();
		
		for(int i=0; i < jdkQueueLength; i++) {
			System.out.println("JDK Queue Poll: " + jdkQueue.poll()); 
		}
		
		//--------- Custom Queue
		
		Queue<Integer> customQueue = new PriorityQueue<>();		
		customQueue.add(10);
		customQueue.add(12);
		customQueue.add(15);
	
		int customQueueLength = customQueue.size();
		
		for(int i=0; i < customQueueLength; i++) {
			System.out.println("Custom Queue Poll: " + customQueue.poll()); 
		}
	}
	
	public void add(E e) {
		this.queueContent.addLast(e);
	}
	
	
	public E poll() {
		return this.queueContent.removeFirst();
	}
	
	public int size() {
		return this.queueContent.size();
	}
	
	public E peek() {
		return this.queueContent.getFirst();
	}

}
