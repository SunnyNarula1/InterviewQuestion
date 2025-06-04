package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntPes {
	//List<String> str=["-1","7","-5","null","18","13"]
			//write a program in java8 using stream api to filter out elements which is divisible by 2
	public static void main(String[] args) {
		
	
	List<String> str = new ArrayList<>();
	str.add("-1");
	str.add("7");
	str.add("-5");
	str.add(null);
	str.add("18");
	str.add("13");
	
	List<Integer> collect = str.stream().filter(i->i!=null).map(i->Integer.parseInt(i)).filter(i-> i%2 ==0).collect(Collectors.toList());
	System.out.println(collect);
			 
		 
	/*Given a string with all letters are in lower case.
	Check if the characters in the string can be rearranged to make it palindrome.
	 
	Example:
	 
	Input: str= dasghdhgsa
	Output: yes and result: dasghhgsad
	*/
	
	String str1 = "aroraaa";
	//dasghd
	
            Map<Character, Long> collect2 = str1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
int count = 0;
for(Map.Entry<Character, Long> entry : collect2.entrySet()) {
	
	if(entry.getValue()==2 ) {
			count++;
	}
	
}
System.out.println("count: "+count);
if(str1.length() ==2*count || str1.length()==2*count +1) {
System.out.println("yes");	
}else {
	System.out.println("No");
}
            
            //            collect2.entrySet().stream().sorted(Map.Entry.)
            
	}

	
	
}
