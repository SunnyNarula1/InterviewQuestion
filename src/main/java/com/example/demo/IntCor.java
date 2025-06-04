package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntCor {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 2, 3, 3, 4 };  // {3,3,3,1,2,2,4}
		LinkedHashMap<Integer, List<Integer>> collect = Arrays.stream(arr).mapToObj(i->(Integer)i).collect(Collectors.groupingBy(Function.identity() 
				, LinkedHashMap :: new , Collectors.toList()));
		
		 int[] array6 = collect.values().stream().flatMap(List ::stream).mapToInt(i->(int)i).toArray();
		System.out.println(collect);
		
		List<Integer> lis = new ArrayList<Integer>();
		for(List<Integer> l : collect.values()) {
			lis.addAll(l);
		}
		int[] array2 = lis.stream().mapToInt(i->(int)i).toArray();
		System.out.println(Arrays.toString(array2));
		
	Map<Integer , List<Integer>> map = new LinkedHashMap();
	for(int num : arr) {
	        map.putIfAbsent(num, new ArrayList<Integer>());
		    map.get(num).add(num);
		
	}
	
	System.out.println(map);

	List<Integer> list = new ArrayList<Integer>();
	for(List<Integer> li : map.values()) {
		list.addAll(li);
	}
	
	int[] array = list.stream().mapToInt(i->(int)i).toArray();
	
	
	System.out.println(Arrays.toString(array));
	
	 }

}
