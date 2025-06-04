package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntPhot {

	public static void main(String[] args) {
		
	
	
	int[] nums = {1,2,3,4}; // Output: [24,12,8,6]
	
	
	int[] leftProd = new int[nums.length];
	
	int[] RightProd = new int[nums.length];
	
	int[] ResultProd = new int[nums.length];
	int leftPr = 1 ;
	
	
	
	int[] result = new int[nums.length];
	
	
for(int i = 0 ;i<nums.length ; i++){
    int product  = 1;
    for(int j = 0 ; j<nums.length ; j++){
      if(i!=j){
       product  = product*nums[j];
    }
    }
    result[i] = product ;
    
}

System.out.println(Arrays.toString(result));

String Str = "leet**cod*e"; //Output :- "lecoe"

/*
 * Map<Character, Long> collect =
 * Str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.
 * identity() ,Collectors.counting()));
 * 
 * collect.entrySet().stream().map(Map.Entry::getKey).map(i->(char)
 * i).filter(i->i.equals(Str.chars())
 */
char[] ch = Str.toCharArray();
Map<Character , Integer> map = null ;
for(int i = 0 ;i<ch.length ; i++) {
	int count = 0 ;
	 map  = new HashMap<>();
	if(map.containsKey(ch[i]) &&  ch[i] != '*'){
		map.put( ch[i] , i);
	}
	map.put(ch[i], i);
	
}

//map {l , o , e :1 ,e:2,t:3 ,*:4 ,*:5
String st = ""; //
System.out.println(map);






/*

1st Problem
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
 
Example 1:
Input: nums = [1,2,3,4] Output: [24,12,8,6]
 
2nd Problem
 
you are given a string s, which contains stars *.
In one operation, you can:
· Choose a star in s.
· Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.
Note:
· The input will be generated such that the operation is always possible.
· It can be shown that the resulting string will always be unique.

 
Example 1:
Input: s = "leet**cod*e" Output: "lecoe" */
 
 
	
	

 


}
} 
 
