package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntNcs {
public static void main(String[] args) {
	List<Integer> lsit = Arrays.asList(1,2,3,4) ; 
	int sum = lsit.stream().mapToInt(i->(int)i).sum();
	System.out.println(sum);
	
	
	List<String> list = Arrays.asList( "honey" , "abc" ,"sunny");
	List<String> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(collect);

	
	
	
}
}
