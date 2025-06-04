package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class IntAcco {
public static void main(String[] args) {
	String str = "abcadefabcbb" ;  //longest string without any charecter 
	// abc = 3  ,cdefab , cbb  // bcadef 
    String result = 	findlongnest(str);
    System.out.println(result);
	
}

private static String findlongnest(String str) {
	int start = 0;
	int startIndex = 0 ; 
	int maxLength = 0 ;
	Map<Character  ,Integer> map = new HashMap();
	
	for(int i =0 ; i<str.length() ; i++) {
		char ch = str.charAt(i);
		if(map.containsKey(ch)) {
			start = Math.max(start, map.get(ch)+1);
		}
		map.put(ch , i);
	if((i-start +1)>maxLength) {
		maxLength = i-start+1 ;
		startIndex = start ;
	}
}
	
	
	
	return str.substring(startIndex , startIndex+maxLength);
	
	
}
}
