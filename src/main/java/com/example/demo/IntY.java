package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntY {
	
	//Lis of string emp 
	
	public static void main(String[] args) {
		
	
	List<String> list = new ArrayList();
	list.add("Sunny");
	list.add("honey");
	list.add("Sunny");
	list.add("Sunny");
	list.add("honey");
	list.add("money");
	
	//out : sunny :3 , honey : 2 ,money : 1
//	key string value :long
	
	Long orElse = list.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting())).entrySet().stream()
			.map(i->i.getValue()).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
          System.out.println(orElse);
          
          
          
          Entry<String, Long> orElse2 = list.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting())).entrySet().stream()
          .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().orElse(null);
          
          
          System.out.println(orElse2);
	}
	}
