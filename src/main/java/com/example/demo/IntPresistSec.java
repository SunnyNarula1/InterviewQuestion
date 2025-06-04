package com.example.demo;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntPresistSec {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java scala ruby", "java react spring java");
		
		int [] input1 = { 0 , 0 , 1 , 1 , 1 , 2 , 2 , 3 , 3 , 4 };
    	//int[]	Input2: { 4 ,3 , 3 , 2 , 2 , 1 , 1 , 1 , 0 , 0 };
			 
			//Output1: 0 , 1 , 2 , 3 , 4 
			//Output2: 4, 3, 2, 1, 0
			 
			//Time Complexity: O(n) 
			//Space Complexity: O(1)
		
		
		List<Integer> collect2 = Arrays.stream(input1).mapToObj(i->(Integer)i).distinct().collect(Collectors.toList());
		System.out.println(collect2);
		Map<String, Long> collect = list.stream().flatMap(i->Arrays.stream(i.split(" "))).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(collect);
			int j =0 ; 
		for(int i = 0 ; i<input1.length-1 ; i++) {
			//if(input1[i] !=)
			
			
		}//400
		//300
		//200
		//100 
		
		
		//  Select Distrint salary from emp order by DSEC salary limit 1 offset 1 ;
		
		
		
		
				
	}

}
