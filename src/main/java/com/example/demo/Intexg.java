package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Intexg {
public static void main(String[] args) {
	int[] denominations = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int amount = 1848;
    
    AtomicInteger remaining = new AtomicInteger(amount);

    Map<Integer, Integer> noteCountMap = new LinkedHashMap<>();

    Arrays.stream(denominations).forEach(denomination -> {
        int count = remaining.get() / denomination;
        if (count > 0) {
            noteCountMap.put(denomination, count);
            remaining.addAndGet(-count * denomination);
        }
    });

    noteCountMap.forEach((denomination, count) ->
        System.out.println(denomination + " - " + count));

    
    Map<Integer, Integer> noteCountMap1 = getNoteCount(denominations, amount);

   // noteCountMap1.forEach((denom, count) ->
     //   System.out.println(denom + " - " + count));
}

private static Map<Integer, Integer> getNoteCount(int[] denominations, int amount) {
	 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int demo :denominations) {
		int count = amount/demo ;
		if(count>0) {
			map.put(demo, count);
			amount-= demo*count;
			
		}
	}
	
	return map;
}
}
