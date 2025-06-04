package com.example.demo;

import java.util.Arrays;

public class IntNe {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3} ; 
		int[] arr1 = {4,5,6} ;
		
		
		int[] result  =mergeSorting(arr, arr1);
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] mergeSorting(int[] arr, int[] arr1) {
	int n = arr.length ; 
	int m = arr1.length ; 
	int[] mergeArr =  new int[n+m];
	int i = 0  ,j= 0 , k = 0;
	while(i<n && j<m) {
		if(arr[i] <=arr1[j]) {
			mergeArr[k++] = arr[i++];
		}else {
			mergeArr[k++] = arr1[j++];
		}
	}
	while(i<n) {
		mergeArr[k++] = arr[i++];
	}
		
	while(j<m) {
		mergeArr[k++] = arr1[j++];
	}
		
		
		
		return mergeArr;
		
	}

}
