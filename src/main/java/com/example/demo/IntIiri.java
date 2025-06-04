package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntIiri {
	public static void main(String[] args) {
		
	
	
	int[] arr1 = {3, 1, 2, 2, 3, 3, 4};
	

	
	        int[] arr = {3, 1, 2, 2, 3, 3, 4};

	        // Step 1: Count frequency
	        Map<Integer, Integer> freqMap = new HashMap<>();
	        for (int num : arr) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        // Step 2: Store elements and original indices
	        List<int[]> list = new ArrayList<>();
	        for (int i = 0; i < arr.length; i++) {
	            list.add(new int[]{arr[i], i}); // [value, original index]
	        }

	        // Step 3: Sort by frequency (desc), then by original index (asc)
	        list.sort((a, b) -> {
	            int freqA = freqMap.get(a[0]);
	            int freqB = freqMap.get(b[0]);
	            if (freqA != freqB) return Integer.compare(freqB, freqA); // higher freq first
	            return Integer.compare(a[1], b[1]); // original order
	        });

	        // Step 4: Build result array
	        int[] result1 = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            result1[i] = list.get(i)[0];
	        }

	        // Print result
	        System.out.println(Arrays.toString(result1));
	    
	

	
	
//	List<Integer> collect = Arrays.stream(arr).mapToObj(i->(Integer)i).collect(Collectors.groupingBy(Function.identity() , LinkedHashMap:: new ,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(
	//		Comparator.reverseOrder())).map(Map.Entry ::getKey).collect(Collectors.toList());
	//System.out.println(collect);
	
	
	 LinkedHashMap<Integer, Long> collect = Arrays.stream(arr).mapToObj(i->(Integer)i).collect(Collectors.groupingBy(Function.identity() , LinkedHashMap:: new ,Collectors.counting()));
	 int[] result = new int[arr.length];
	
	 Iterator<Entry<Integer, Long>> iterator = collect.entrySet().iterator();
	 while (iterator.hasNext()) {
		 int j = 0 ;
		 Entry<Integer, Long> next = iterator.next();
		
		 for(int i =0 ; i<next.getValue();i++) {
			 result[j++] = next.getKey();
		 }
		 
		
	}	 
	 
		/*
	
		 * collect.forEach((ele ,count)->{
		 * 
		 * for(int i = 0 ; i<count ; i++) { result[i] = ele ; } });
		 */ 
	
	 System.out.println(Arrays.toString(result));
	
	 
	// = {3, 3, 3, 2, 2, 1, 4]
	
/*
    // Step 1: Count frequencies
    Map<Integer, Long> freqMap = Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

    // Step 2: Stream and sort based on frequency, preserving original order
    List<Integer> result = IntStream.range(0, arr.length)
        .mapToObj(i -> arr[i])
        .sorted((a, b) -> {
            int freqCompare = Long.compare(freqMap.get(b), freqMap.get(a));
            return freqCompare != 0 ? freqCompare : 0; // stable sort keeps original order
        })
        .collect(Collectors.toList());
        
        */
	 
	}}
