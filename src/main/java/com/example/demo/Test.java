package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	
//	("Prodapt", "Chennai", "Hyderabad", "Prodapt")
	//out
	//output ={HYDERABAD=1, CHENNAI=1, PRODAPT=2}
	public static void main(String[] args) {
		
		List<Integer> list = new  ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(24);
		list.add(27);
		//{27,24,5,4,2}
		
		int[] arr = {2,45,3,45,6,3};
		List<Integer> collect2 = Arrays.stream(arr).mapToObj(i->(Integer) i).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
		Integer sorted = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(sorted);
	//	System.out.println(sorted.get(0));
		
		
		
		  List<String> lit = new  ArrayList<String>();
		  lit.add("Prodapt");
		lit.add("Prodapt");
		lit.add("Chennai");
		lit.add("Hyderabad");
				
		
		Map<String, Long> collect = lit.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));
	System.out.println(collect);
	
	}
}