package com.dineshwork.interview.coding;

import java.util.*;

public class DeleteNodeFromTree {
	
	public static void main(String[] args) {
		int[] parentArr = {1, 4, 1, 9, 3, 7, 0};
		int[] childArr = {4, 5, 3, 12, 8, 10, 2};

		Map<Integer, List<Integer>> tree = new HashMap<>();
		
		for(int i = 0; i < parentArr.length; i++) {
			
			List<Integer> childs = tree.get(parentArr[i]);
			
			if(childs == null) {
				childs = new ArrayList<>();
			}
			
			childs.add(childArr[i]);			
			tree.put(parentArr[i], childs);
		}
		
		System.out.println(tree);
		deleteParent(tree, 1);
		
		//System.out.println(tree);
	}
	
	public static void deleteParent(Map<Integer, List<Integer>> tree, int parent) {
		
		List<Integer> childs = tree.get(parent);
		
		if(childs == null) return;
		
		childs.forEach(c -> {
			System.out.println("Kill" + c);
			deleteParent(tree, c);			
		});
	}
}
