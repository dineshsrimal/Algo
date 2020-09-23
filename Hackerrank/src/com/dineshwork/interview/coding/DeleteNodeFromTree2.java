package com.dineshwork.interview.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DeleteNodeFromTree2 {
	
	public static void main(String[] args) {
		String[] parentChildPIDMapping = { "1,2", "1,3", "2,4", "2,5", "3,6", "3,7", "4,8", "4,9", "5,10", "10,11" };
		Map<Integer, Node> tree = new HashMap<>();
		
		for(String keyVal: parentChildPIDMapping) {
			String[] parentChildPair = keyVal.split(",");
			Integer parentPID = Integer.parseInt(parentChildPair[0]);
			Integer childPID = Integer.parseInt(parentChildPair[1]);
			
			Node parentNode = tree.get(parentPID);
			Node childNode = tree.get(childPID);
			
			if(parentNode == null) {
				parentNode = new Node(parentPID);
			}
			
			if(childNode == null) {
				childNode = new Node(childPID);
			}			
			
			parentNode.childs.add(childNode);
			tree.put(parentPID, parentNode);
			tree.put(childPID, childNode);
		}
		
		System.out.println(tree);
		System.out.println("delete parent...: " + deleteParentProcess(tree, new Node(4)));
	}
	
	public static boolean deleteParentProcess(Map<Integer, Node> tree, Node deleteNode) {
		Node rootNode = tree.get(1);
		Queue<Node> traversedNodes = new LinkedList<>();
		traversedNodes.add(rootNode);
		rootNode.isVisited = true;

		while (!traversedNodes.isEmpty()) {

			Node currentNode = traversedNodes.remove();


			for (Node node : currentNode.childs) {
				if (node.isVisited == false) {
					System.out.println("Visting Node: " + node.id);
					node.isVisited = true;
					traversedNodes.add(node);
				}

				if (node.equals(deleteNode)) {
					currentNode.childs.remove(node);
					return true;
				}

			}
		}
		
		return false;
	}
}

class Node{
	
	public int id;
	public List<Node> childs;
	public boolean isVisited;
	
	public Node(int idVal) {
		this.id = idVal;
		this.childs = new ArrayList<>();
	}
	
	public boolean equals(Object o) {
		return ((Node)o).id == this.id;		
	}
	
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Node[id=" + id + " childs="+ Arrays.toString(childs.toArray()) + "]";
	}
}
