package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intinfo {
public static void main(String[] args) {
	String s1 = "my name is sunny" ;
	
	
	
	
	
	
	Set<Character> seen = new HashSet();
	Optional<Character> findFirst = s1.chars().mapToObj(i->(char)i).filter(i->i!=' ').filter(i->!seen.add(i)).findFirst();
	
	System.out.println("using set "+ findFirst);
	
	Character orElse = s1.chars().mapToObj(i->(char)i).filter(i->i!=' ').collect(Collectors.groupingBy(Function.identity() ,LinkedHashMap ::new , Collectors.counting())).
			entrySet().stream().filter(i->i.getValue()>1).map(Map.Entry ::getKey).findFirst().orElse(null);
    System.out.println(orElse);

/*s1.chars() — gives IntStream of character codes.

.mapToObj(c -> (char) c) — convert int to Character.

.filter(c -> c != ' ') — skip spaces.

.collect(Collectors.groupingBy(...)) — count occurrences while preserving order with LinkedHashMap.

.filter(entry -> entry.getValue() > 1) — find repeated characters.

.findFirst() — pick the first repeated one.  */


}
}
