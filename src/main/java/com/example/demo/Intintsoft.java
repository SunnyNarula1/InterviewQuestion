package com.example.demo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Intintsoft {
public static void main(String[] args) {
	

	
//	String str = "aabbbcddddd";  // d:4 b:3 a:2 c:1
	String str = "arora";
	boolean anyMatch = IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
	System.out.println(anyMatch);
	
	String collect2 = IntStream.range(0, str.length()).map(i->str.charAt(str.length()-i-1)).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
    System.out.println(collect2);
	List<Entry<Character, Long>> collect = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity() , Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
	   System.out.println(collect);
	//Studnent  stundent name , strudet id , strudetn marks
	
	//find 5 th highest
	   
	   
	  String result  =  str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity() , Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(entry->entry.getKey() + ":"+ entry.getValue()).collect(Collectors.joining(" "));
	  System.out.println("using map " + result);
	
//	Select Distint studentMask from student order by studentMask DSEC Limit 1 offset 4 ;
	
	
}

}
