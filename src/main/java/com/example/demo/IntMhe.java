package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntMhe {
	
		public static void main(String[] args) {
	        int[] a = {8, 7, 6, 6};
	        int[] b = {6, 1, 5, 4, 3, 4};
	        int[] c = {1, 3, 4, 5, 6, 7, 8};
	        
	        List<Integer> result = Stream.of(a, b, c)                   // Stream<int[]>
	                .flatMapToInt(Arrays::stream)                       // IntStream of all elements
	                .distinct()                                         // Remove duplicates
	                .sorted()                                           // Sort
	                .boxed()                                            // Convert IntStream to Stream<Integer>
	                .collect(Collectors.toList());                      // Collect to List
  
	        System.out.println(result);  // Output: [1

	        //second way 
	        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
	        Arrays.stream(b).boxed().forEach(list::add);
	        Arrays.stream(c).boxed().forEach(list::add);

	        Map<Integer, Long> map = list.stream()
	                .sorted()
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        map.forEach((ele, count) -> {
	            if (count == 1) {
	                System.out.print(ele + " ");
	            }
	        });
	    }
}


