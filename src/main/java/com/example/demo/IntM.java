package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntM {
	public static void main(String[] args) {
		
	
/*	Input:
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		*/
int[] arr = {2,7,11,15};
int target= 9 ;
int [] result = 	findIndex(arr, target);



System.out.println(Arrays.toString(result));
}

	private static int[] findIndex(int[] arr, int target) {
		int[] result = new int[2];
		Map<Integer ,Integer> map = new HashMap();
		
		for(int a=0 ; a<arr.length -1 ; a++) {
			if(map.containsKey(target-arr[a])) {
				return new int[] {map.get(target-arr[a]) ,a };
			}
			map.put(arr[a],a);
		}
		
		
		// TODO Auto-generated method stub
		return new int[] {-1, -1};
	}
}
