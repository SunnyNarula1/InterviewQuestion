package com.example.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intinfoef {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	Map<Character, Long> collect = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
	System.out.println(collect);
	
}
	
}
