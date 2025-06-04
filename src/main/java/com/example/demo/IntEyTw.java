package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntEyTw {
public static void main(String[] args) {
	//list of string "sunny" , "ram" ; "bad" ; 

	// fatch 3 > "sunny"  //opus interview 
	List<String> list  = Arrays.asList("sunny" , "ram" , "bad" );
	Map<String, List<String>> collect3 = list.stream().collect(Collectors.groupingBy(s->s.length()>3 ?"greater then 3 :" : "less than 3"));
	System.out.println(collect3);
	 Map<Boolean, List<String>> result = list.stream().filter(s -> s.length() != 3) // skip length == 3
             .collect(Collectors.partitioningBy(s -> s.length() > 3));

     List<String> greaterThan3 = result.get(true);
     List<String> lessThan3 = result.get(false);

     System.out.println("Length > 3: " + greaterThan3);
     System.out.println("Length < 3: " + lessThan3);
	List<String> collect = list.stream().filter(i->i.length()>3).collect(Collectors.toList());
    System.out.println(collect);

   List<String> collect2 = list.stream().filter(i->i.length()<=3).collect(Collectors.toList());
    System.out.println(collect2);
	 


}
}
