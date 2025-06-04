package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntEy {
	public static void main(String[] args) {
		
	
	String str = "Hello";

	String result = reversString( str);
	System.out.println(result);
	
	
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(-4);
	list.add(1); //
	list.add(2); //second
	list.add(3); // max
	list.add(-5);
	Integer orElse = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	System.out.println(orElse);
	
	
	}
	private static String reversString(String str) {
		// TODO Auto-generated method stub
	
		char[] ch = str.toCharArray();
		int start = 0;
		int end = ch.length-1 ;
		while(start<end) {
		char temp = ch[start];
		ch[start]= ch[end];
		ch[end] = temp;
		start++;
		end --;
		}
		
		return new String(ch);
		
		
	}	
	
	
	
	
}
