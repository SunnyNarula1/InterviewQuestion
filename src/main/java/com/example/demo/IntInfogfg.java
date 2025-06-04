package com.example.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IntInfogfg {
	public static void main(String[] args) {
        String input = "Java 8 Stream Rocks";
        IntInfogfg object = new IntInfogfg();
        
        String collect = Arrays.stream(input.split(" ")).map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println("usinmg stream " +collect);
        String result = object.reversallString(input);
        System.out.println(result);  // Output: avaJ 8 maertS skcoR
        
        String collect2 = Arrays.stream(input.split(" ")).map(IntInfogfg ::reversString).collect(Collectors.joining(" "));
        System.out.println();
        
        
	}

	public String reversallString(String input) {
		StringBuilder result = new StringBuilder();
		String[] split = input.split(" ");
		for(String str :split) {
			String st = reversString(str);  
			result.append(st);
			result.append(" ");
		}
		return result.toString();
	}

	private static String reversString(String str) {
		char[] ch = str.toCharArray();
		int left = 0 ;
		int right = ch.length-1 ;
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp ;
			left ++ ;
			right--;
		}
		
		return new String(ch);
	}
}



