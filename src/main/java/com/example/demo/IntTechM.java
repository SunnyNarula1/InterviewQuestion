package com.example.demo;

import java.util.Arrays;

public class IntTechM {

	// list of emp

	public static void main(String[] args) {

		String str = "hello";
		int start = 0;
		int end = str.length() - 1;
		char[] ch = str.toCharArray();

		while (start < end) {
			if(!isVowel(ch[start])) {
				start ++ ;
			}else if (!isVowel(ch[end])) {
				end--;
			}else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp ;
				start++;
				end--;
			}
			}

		System.out.println(new String(ch));

	}
	private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
