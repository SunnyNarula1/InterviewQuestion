package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Intw2 {
public static void main(String[] args) {
	

	int[] arr = {1,2,3,4,5,6,7,8,9,10};  
	
	//instand boolean 
	Map<Boolean, List<Integer>> collect = Arrays.stream(arr).mapToObj(i->(Integer)i).collect(Collectors.partitioningBy(i->i%2==0));
	
	 Map<String, List<Integer>> collect2 = Arrays.stream(arr).mapToObj(i->(Integer)i).collect(Collectors.groupingBy(i-> i%2==0 ? "Even " : "Odd"));
	 System.out.println(collect2);
	 
		/*
		 * collect.forEach((ele,count)->{ if(ele) { System.out.println("Even :" +count);
		 * }else { System.out.println("Odd :" + count); } });
		 */
}	
}
