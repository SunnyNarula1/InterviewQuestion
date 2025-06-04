package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntDsfd {
public static void main(String[] args) {
  
	Three three = new Three(); 
	//Java 8 : find the first non repeated character with functional programming and streams:

//		If input string is “analogy”,  then program should return ‘n’ 

//		If input string is “easiest”, then program should return ‘a’ 

	String str = "easiest" ;// a 
	
	Character orElse = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity() , LinkedHashMap :: new  ,Collectors.counting()))
			           .entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry :: getKey).findFirst().orElse(null);
	System.out.println(orElse);	 
	
	
}
}

