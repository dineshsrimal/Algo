package com.dineshwork.searching.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

	public int data;
	public boolean isVisited = false;
	public List<Node> neighbours;

	public Node(int d) {
		this.data = d;
		this.neighbours = new ArrayList<>();
	}

	public void addneighbours(Node n) {
		this.neighbours.add(n);
	}
}