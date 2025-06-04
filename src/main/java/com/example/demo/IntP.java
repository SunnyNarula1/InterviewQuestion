package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntP {
	public static void main(String[] args) {
		
	
	//"Pne", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"
	List<String> list = new ArrayList<>();
	list.add("Pen");
	list.add("Eraser");
	list.add("Note Book");
	list.add("Pen");
	list.add("Pencil");
	list.add("Note Book");
	list.add("Pencil");
	
	Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
	System.out.println("Each word with count"+collect);
	
	Map<Character, Long> collect2 = list.stream().flatMap(i->i.chars().mapToObj(obj->(char)obj)).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
			System.out.println(collect2);
			
	System.out.println(collect2);
	
	}
}
