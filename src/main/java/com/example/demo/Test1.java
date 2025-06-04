package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
public static void main(String[] args) {
	List<Integer> list  = Arrays.asList(2,4,5,2,3,4,5,6,6,7);
	
	List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
	System.out.println(collect);

	Map<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	collect2.forEach((element,count)->
	{
		if(count==1) {
			System.out.println(element);
			
		}
	});

	//unique char
	String str = "arora";
  //reverse String
	String collect4 = IntStream.range(0, str.length()).map(i->str.charAt(str.length()-i-1)).mapToObj(i->String.valueOf((char)i)).collect(Collectors.joining());
	System.out.println(collect4);
	
	if(str.equals(collect4)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	boolean noneMatch = IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1));
	System.out.println(noneMatch);
	
	
	Map<Character, Long> collect3 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    collect3.forEach((ele , count)->{
	if(count==1) {
		System.out.println(ele);
	}
    });
    
   IntStream chars = str.chars(); 
   char[] charArray = str.toCharArray();
   
   // unique char
   Map<Character , Integer> map = new HashMap<Character, Integer>();
   for(int i =0; i<str.length();i++) {
       if(map.containsKey(str.charAt(i))) {
    	   map.put(str.charAt(i), map.get(str.charAt(i))+1);
       }else {
    	   map.put(str.charAt(i), 1);
       }
   }
   Set<Character> chr = new HashSet<Character>();
  // char[] chr = new char[str.length()];
   map.forEach((elem, cout)->{
	   if(cout==1) {
		   System.out.println(elem);
		   chr.add(elem);
	   }
   });
   System.out.println(chr);
}
}
  