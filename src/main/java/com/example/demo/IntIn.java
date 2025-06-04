package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntIn {
public static void main(String[] args) {
	 List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
     
     List<String> sortedString = listOfStrings.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
    		
     
     
     System.out.println(sortedString);
     
     List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 33,11,111, 75, 31, 89);
     
      Integer secondMax =   listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
     System.out.println("second Max:   "+secondMax);
     
     Integer secondMin =  listOfIntegers.stream().sorted().skip(1).findFirst().orElse(null);
     System.out.println("Second Min : "+secondMin);

     
      
      int[] arr = {2,3,4,1,0,6};
      
      int missingNumber = findMissingNumber(arr);
      System.out.println("missingNumber "+ missingNumber);
  }
  
  
  public static int findMissingNumber(int[] arr){
    
    int n = arr.length;
    int expectedSum = (n*(n+1))/2 ;
    
    int sum = 0 ;
    for(int i = 0 ; i< n ; i++){
      sum  += arr[i];
    }
    
    
    return expectedSum-sum;
    
    
  }
  
  
}


