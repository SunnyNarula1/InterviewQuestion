package com.example.demo;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intdgd {
public static void main(String[] args) {
//	Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum.
	 
	//Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
	//Output: 6 (Subarray: [4, -1, 2, 1])

   //	O(n)
	
	
	  Set<Character> seen = new HashSet<>();

		/*
		 * Optional<Character> firstDuplicate = str.chars() .mapToObj(c -> (char) c)
		 * .filter(c -> !seen.add(c)) // If add() returns false, it means it's a
		 * duplicate .findFirst();
		 */

      
	String str = "sunnytdft";
	Character else1 = str.chars().mapToObj(i->(char)i).filter(i->!seen.add(i)).findFirst().orElse(null);
	Character orElseGet = str.chars().mapToObj(i->(char)i).sorted().findFirst().orElseGet(null);
	
     	System.out.println(else1);
     	                                            // Convert to Character
     	Optional<Character> secondDuplicate = str.chars().mapToObj(c -> (char) c) .collect(Collectors.toMap(Function.identity(),v -> 1,Integer::sum,
                       LinkedHashMap::new // Maintain insertion order
                )).entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Find duplicates
                .skip(1) // Skip the first duplicate
                .map(Map.Entry::getKey)
                .findFirst(); // Get the second duplicate
System.out.println("using to map :"+ secondDuplicate.get());
				/*
				 * // Output the result secondDuplicate.ifPresentOrElse( ch ->
				 * System.out.println("Second duplicate character: " + ch), () ->
				 * System.out.println("No second duplicate found") );
				 */
	
	
	Map<Character, Long> collect = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	 Character secondDuplicate1 = str.chars()
             .mapToObj(c -> (char) c) // Convert int to Character
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Count occurrences
             .entrySet().stream()
             .filter(entry -> entry.getValue() > 1) // Filter duplicates
             .skip(1) // Skip first duplicate
             .map(Map.Entry::getKey)
             .findFirst()
             .orElse(null); // G
	
	System.out.println("using group by"+ secondDuplicate1);
	
		
	
	
	int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
	
    int a = largestSubArray(arr);	
    System.out.println(a);
}

private static int largestSubArray(int[] arr ) {
	int max = arr[0]; //-2
	int currentMax = arr[0]; //-2
	for(int i = 1;i<arr.length;i++) {
		//-2+1 = -1
		System.out.println(i+" th "+arr[i] +"currentMax " + currentMax);
		currentMax = Math.max(arr[i] ,currentMax +arr[i]);
		System.out.println(i+" th 1"+arr[i] +"currentMax " + currentMax);
		max = Math.max(currentMax , max);
		System.out.println("max"+max +"currentMax" + currentMax);
	}
	return max;
	
	
	

}
	
}
   