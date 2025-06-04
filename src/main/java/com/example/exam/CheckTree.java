package com.example.exam;

public class CheckTree {
public static void main(String[] args) {
	TreeNode parent = new TreeNode(5);
	parent.left =  new TreeNode(3);
	parent.right =  new TreeNode(4);
	parent.left.left =  new TreeNode(1);
	parent.left.right =  new TreeNode(2);
	
	
	TreeNode child =  new TreeNode(3);
	child.left =  new TreeNode(1);
	child.right =  new TreeNode(2);
	
	
boolean result  = isCheckSubTree(parent , child);
	
System.out.println(result);


int[] arr = {0 ,-1,2,-3,1};

System.out.println(findtriplet(arr));


}
//O(n³) — Cubic Time Complexity
private static boolean findtriplet(int[] arr) {
	int n = arr.length ;
	boolean found = false;
	for(int i =0 ; i<n-2 ; i++) {
		for(int j=i+1 ; j<n-1 ; j++) {
			for(int k =j+1 ; k<n ; k++) {
				int sum = arr[i]+arr[j]+arr[k];
				if(sum == 0 ) {
					System.out.println(arr[i]+", "+arr[j]+","+arr[k]);
					found = true ;
				}
				
			}
		}
	}
	
	return found ;
	
}

private static boolean isCheckSubTree(TreeNode parent, TreeNode child) {
	if(child==null) {
		return true ;
	}
	if(parent == null) {
		return false;
	}
	
	if(isCheckTree(parent , child)) {
		return true ;
	}
	return  isCheckSubTree(parent.left, child) || isCheckSubTree(parent.right, child);
}

private static boolean isCheckTree(TreeNode parent, TreeNode child) {
	if(parent == null && child == null) {
		return true ;
	}
	if(parent == null || child ==null) {
		return false;
	}
	return parent.val==child.val && isCheckTree(parent.left, child.left) && isCheckTree(parent.right, child.right);
}
}
