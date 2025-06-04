package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntD {
public static void main(String[] args) {
	int[] arr = {1,3,2 ,4,5} ;//output :-  1,2,3,4 ,





	List<Integer> list  = Arrays.stream(arr).mapToObj(i->(Integer)i).sorted().collect(Collectors.toList());  //1,2,3,4,5
    System.out.println("Result 1 "+ list);

	List<Integer> result2  = Arrays.stream(arr).mapToObj(i->(Integer)i).sorted(Comparator.reverseOrder()).collect(Collectors.toList());///5,4,3,2,1
	System.out.println("Result 2 "+ result2);
	
	
	
	 Integer orElse = Arrays.stream(arr).mapToObj(i->(Integer)i).sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
	 System.out.println(orElse);
	 
	 int traget = 3 ; 
	 int[] arr1 = {1,2 ,3,4,5};
	    int result = findBySearch(arr1 ,traget);
	    System.out.println("binary "+ result);
	}

private static int findBySearch(int[] arr, int traget) {
	
	int start = 0 ; 
	int end = arr.length-1;
	while(start<end) {
		int mid = start + (end-start)/2;
		System.out.println("mid" + mid);
		if(arr[mid]==traget) {
			return arr[mid];
		}else if (arr[mid]<traget) {
			start = mid+1;
		}else {
			end= mid -1 ;
		}
	}
		return -1;
}
}
