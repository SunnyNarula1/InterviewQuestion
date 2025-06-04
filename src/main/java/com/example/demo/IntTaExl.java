package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntTaExl {

	public static void main(String[] args) {
		// String = sunny  out :- s:1 ,u:1 , n:2 , y :1 
	/*	input:
			Media
			Communication
			Transport
			Health
			 
			output:
			count - String
			13 - Communication
			9 - Transport
			6 - Health
			5 - Media
			*/
		List<String> list = new ArrayList<String>();
		list.add("Media");
		list.add("Communication");
		list.add("Transpost");
		list.add("Health");
		
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String :: length));
		System.out.println(collect);
		
		
	}
}
