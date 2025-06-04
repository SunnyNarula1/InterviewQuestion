package com.example.demo;

import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intew {
public static void main(String[] args) {
	
	String str = "swwiss"; //s 

	//str.chars().maptoObj(i->(char) i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()).entrySet().stream().sorted(Map.entry.Compartor.comparingBy
	//(Map.Entry :: getvalue).reversed()).findFirst().orElse(null);
	
	
	Character collect = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity() , Collectors.counting())).entrySet().stream().
			sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(Map.Entry :: getKey).findFirst().orElse(null);

	System.out.println(collect);
}
}
