package com.dineshwork.searching;

import java.util.*;

import com.dineshwork.searching.model.Node;

public class BreadthFirstSearch {
	static Queue<Node> traversalQueue = new LinkedList<Node>();

	public static void main(String[] args) {
		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

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
		System.out.println("Found  element in tree: " + BFS(node40, node60));
	}

	public static boolean BFS(Node source, Node destination) {		
		traversalQueue.add(source);
		source.isVisited = true;

		while (!traversalQueue.isEmpty()) {
			Node node = traversalQueue.remove();
			System.out.println("visiting node: " + node.data);
			
			if (node.data == destination.data) {
				return true;
			}

			for (Node neighbour : node.neighbours) {

				if (neighbour.isVisited == false) {
					neighbour.isVisited = true;
					traversalQueue.add(neighbour);
				}
			}
		}
		return false;
	}
}


