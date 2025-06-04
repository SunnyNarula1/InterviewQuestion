package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntHar {
public static void main(String[] args) {
	/*List<String> names = Arrays.asList("Alice", "Bob", "Alexander", "John", "", null,"Den");

	String a = "First"; //string pool
	//[null, , Bob, Alice, Den, John, Alexander]

	for(int i = 0 ; i<names.size() ; i++) {
		for(int j = 0 ; j<names.size()-i-1 ;j++) {
			
			String str = names.get(j);
			String str1 = names.get(j+1);
			
			if(str.charAt(str.length()-i-1) > str1.charAt(str.length()-j-1)) {
				String temp = names.get(j);
				names.set(j, temp);
				
			}
			
			 String a = "First"; //string pool String b = "Second"; // string pool String
			 * c = new String("First"); // new String d = "Second"; //refrea
			 			
		}
*/	
		
	/*
	References: 4 (a, b, c, d)

	Objects: 3

	"First" in the String pool

	"Second" in the String pool

	New String object on the heap via new String("First") */	
	String a = "First";
	String b = "Second";
	String c = new String("First");
	String d = "Second";

	
	
		List<String> names = Arrays.asList("Alice", "Bob", "Alexander"); //find the length  of string 
		
		List<String> collect2 = names.stream().sorted(Comparator.comparing(String :: length)).skip(1).collect(Collectors.toList());
				
		
		
		
		Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String :: length));
		collect.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).skip(1).collect(Collectors.toList());
		
		List<String> name = Arrays.asList("Alice", "Bob", "Alexander", "John", "", null,"Den");
		List<String> collect3 = name.stream().filter(i->i!=null && !"".equals(i)).sorted(Comparator.comparing(s->s.charAt(s.length()-1))).collect(Collectors.toList());
		System.out.println(collect3);
		
	
}

	
}

