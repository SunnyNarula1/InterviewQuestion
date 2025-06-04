package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//Ltitree interview question
public class Min {

	public static void main(String[] args) {
	//	101, 99, 30, 77, 6, 5
    Integer orElse = Stream.of(101, 99, 30, 77, 6, 5).min(Comparator.naturalOrder()).orElse(null);
    
    
    System.out.println(orElse);

	int min = IntStream.of(101, 99, 30, 77, 6, 5).min().getAsInt();
	System.out.println("Min:" +min);
	int asInt = IntStream.of(101, 99, 30, 77, 6, 5).max().getAsInt();
	System.out.println("Max:" +asInt);
	int [] arr = {101, 99, 30, 77, 6, 5};
	
	
	Integer secondHightset = Arrays.stream(arr).mapToObj(i->(Integer)i).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	System.out.println(secondHightset);
	

	
	
	int asInt2 = Arrays.stream(arr).max().getAsInt();
	System.out.println(asInt2);
	Integer orElse2 = Arrays.asList(101, 99, 30, 77, 6, 5).stream().min(Comparator.naturalOrder()).orElse(null);
    System.out.println(orElse2);
	}
}
