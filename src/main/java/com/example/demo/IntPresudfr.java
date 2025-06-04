package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntPresudfr {

// mamphissi	Emp   id ,name ,salary  age , 
	public static void main(String[] args) {
		
		
		String input = "sung";
		 boolean canFormPalindrome = input.chars() // stream of int (unicode)
	                .mapToObj(c -> (char) c) // convert to Character
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // count occurrences
	                .values().stream() // Stream of counts
	                .filter(count -> count % 2 != 0) // keep only odd counts
	                .count() <= 1; // at most 1 odd count allowed

	        System.out.println("Can be rearranged to palindrome? " + canFormPalindrome);
		List<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(10 , "summy" , "1000" , "35"));
		list.add(new Employees(10 , "summy" , "58000" , "35"));
		
		list.add(new Employees(10 , "summy" , "98000" , "58"));
		
		list.add(new Employees(10 , "summy" , "90000" , "58"));
		Map<String, List<Employees>> collect2 = list.stream().collect(Collectors.groupingBy(Employees::getAge));
		System.out.println(collect2);
		List<Employees> collect = list.stream().sorted(Comparator.comparing(Employees ::getSalary)).collect(Collectors.toList());
		System.out.println(collect);
		
		
		int[] arr = {2,3,1,6,7 ,2,3,4} ;
		int[] result = new int[arr.length];
		int tem = 0 ;
	   for(int i = 0 ; i<arr.length ; i++) {
		int current = arr[i];
		boolean isUnique = true ;
		for(int j = 0 ; j<arr.length ; j++) {
			if(i!=j && current==arr[j]) {
				isUnique = false;
				break;
			}
		}
		
		if(isUnique) {
			
			result[tem++] = current;
		}
		
	}
	   int[] finalResult1 = Arrays.copyOf(result, tem);
	System.out.println(Arrays.toString(finalResult1));
	
	int a = 0 ;
	Map<Integer , Integer> map = new HashMap<Integer, Integer>();
	for(int num : arr) {
		map.put(num, map.getOrDefault(num, 0)+1);
	}
	int[] resu = new int[arr.length];
	for(int num : arr) {
		if(map.get(num) == 1) {
			resu[a++] = num;
		}
	}
	
	int[] finalResult = Arrays.copyOf(resu, a);
	System.out.println(Arrays.toString(finalResult));
	
	
	
	
}
}
