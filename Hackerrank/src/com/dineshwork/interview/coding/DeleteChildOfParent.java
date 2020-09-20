package com.dineshwork.interview.coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class DeleteChildOfParent {

	public static void main(String[] args) {
		String[] parentChildPIDMapping = { "1,2", "1,3", "2,4", "2,5", "3,6", "3,7", "4,8", "4,9", "5,10", "10,11" };
		Map<String, LinkedList<String>> hierachies = new HashMap<>();

		for (String keyValPair : parentChildPIDMapping) {
			String[] keyValArr = keyValPair.split(",");
			String parent = keyValArr[0];
			String newChild = keyValArr[1];

			LinkedList<String> childList = hierachies.get(parent);

			if (childList == null) {
				childList = new LinkedList<>();
				hierachies.put(parent, childList);
			}

			childList.add(newChild);
		}

		hierachies.forEach((k, v) -> {
			System.out.println("Parent: " + k + ", Childs: " + v.toString());
		});

		deleteNode(hierachies, "5");
		System.out.println("==============================after removal==========================");
		hierachies.forEach((k, v) -> {
			System.out.println("Parent: " + k + ", Childs: " + v.toString());
		});

	}

	/***
	 * first delete the 
	 * @param tree
	 * @param node
	 */
	public static void deleteNode(Map<String, LinkedList<String>> tree, String node) {	

		for (Entry<String, LinkedList<String>> entry : tree.entrySet()) {
			entry.getValue().removeIf(n -> n.equalsIgnoreCase(node));
		}
		
		deleteSubStree(tree, node);
		
	}
	
	public static void deleteSubStree(Map<String, LinkedList<String>> tree, String node) {
		LinkedList<String> childs = tree.get(node);

		if (childs != null) {
			for (String childNode : childs) {
				deleteSubStree(tree, childNode);
			}
			tree.remove(node);
		}
	}

}
