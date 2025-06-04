package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cap {
public static void main(String[] args) {
	List<String> lis = new ArrayList<>();
	lis.add("sunny");
	List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
	
	
	     
	/*  
	 * List<String> collect = list.stream().distinct().collect(Collectors.toList());
	 * System.out.println("stream " + collect); // output :- stream [Java, Python,
	 * C#, Kotlin]
	 */
		/*
		 * Set<String> ls = new HashSet<>(); for(String str : list) { ls.add(str); }
		 * System.out.println("set "+ls); // output :- set [C#, Java, Python, Kotlin]
		 */	 	
	 Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
	  
		 collect.forEach((elem, count)->{
			 if(count==1) {
				 System.out.println(elem);
			 }
		 });
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String a : list) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		map.forEach((element, count) -> {
			if (count == 1) {
				System.out.println(element);
			}
		});
		
		
	 
}
}
     