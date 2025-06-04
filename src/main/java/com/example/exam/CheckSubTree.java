package com.example.exam;

import java.util.LinkedList;
import java.util.Queue;

public class CheckSubTree {

	
	
	public static void main(String[] args) {
		TreeNode parent = new TreeNode(1);
		parent.left = new TreeNode(2);
		parent.right = new TreeNode(3);   
		parent.left.left = new TreeNode(4);
		parent.left.right = new TreeNode(5);
		
		TreeNode child = new TreeNode(2);
		child.left = new TreeNode(4);
		child.right = new TreeNode(5);
		
		dfsInOrder(parent);  //4 2 5 1 3 
		System.out.println(); 
		dfsPostOrder(parent); // 4 5 2 3 1 
		System.out.println(); 
		dfsPreOrder(parent); //1 2 4 5 3 
		System.out.println(); 
		
		bfsoRDER(parent);
		
		boolean result=isSubTree(parent ,child);
		
		System.out.println(result);
	}

	private static void bfsoRDER(TreeNode parent) {
		if(parent == null) {
			return  ;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(parent);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll() ; 
			System.out.print(temp.val + " ");
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}
		}
		
		
		
		
	}

	private static void dfsPostOrder(TreeNode parent) {
		// TODO Auto-generated method stub
		if(parent == null) {
			return ; /// left , right root
		}
		dfsPostOrder(parent.left);
		dfsPostOrder(parent.right);
	    System.out.print(parent.val + " ");
		
	}

	private static void dfsPreOrder(TreeNode parent) {
		if(parent== null) {
			return ;    // root , left , right
		}
		System.out.print(parent.val+ " " );
		dfsPreOrder(parent.left);
		dfsPreOrder(parent.right);
		
	}

	private static void dfsInOrder(TreeNode parent) {
	if(parent == null) {
		return ;
	}
	dfsInOrder(parent.left);
	System.out.print(parent.val+ " " );
	dfsInOrder(parent.right);
		
	}

	private static boolean isSubTree(TreeNode parent, TreeNode child) {
		
		if(child ==null) {
			return true;
		}
		if(parent == null) {
			return false;
		}
		if(isCheckSubTree(parent , child)) {
			return true ;
		}
	return isSubTree(parent.left, child) || isSubTree(parent.right, child);
		
	}

	private static boolean isCheckSubTree(TreeNode parent, TreeNode child) {
		if(parent == null && child == null) {
			return true ;
		}
		if(parent ==null || child == null) {
			return false ;
		}
		return parent.val == child.val && isCheckSubTree(parent.left, child.left) && isCheckSubTree(parent.right, child.right);
	}
}
