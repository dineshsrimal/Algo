package com.dineshwork.searching;

import java.util.ArrayList;
import java.util.List;

import com.dineshwork.searching.model.Node;

public class DepthFirstSearch {
	
	public static void main(String[] args) {
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);		
		System.out.println("Found  element in tree: " + DFS(node40, node60));
	}
	
	public static boolean DFS(Node source, Node destination) {
		System.out.println("visiting node: " + source.data);
		
		if(source.data == destination.data) {
			return true;
		}
		
		if(source.isVisited) {
			return false;
		}
		
		for(Node child : source.neighbours) {
			
			return DFS(child, destination);
		}
		
		return false;
	}

}


