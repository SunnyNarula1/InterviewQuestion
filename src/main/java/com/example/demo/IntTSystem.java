package com.example.demo;

import java.util.Arrays;
import java.util.Stack;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class IntTSystem {
	public static void main(String[] args) {
	//	[{()}] --> true
	//	[{(})] --> false
	//	[[[[]]]] --> true
		String str = "[[[[]]]]";
		
		Boolean result = checkTheBacket(str);
		System.out.println(result);
		int[] arr = {3,1,2,5,4};
		int index  = 3 ;
		int[] array = IntStream.range(0 , arr.length).filter(i->i!=index).map(i->arr[i]).toArray();
		System.out.println(Arrays.toString(array));
	    //int[] array = Arrays.stream(arr).
		//System.out.println(Arrays.toString(array));
		//int[] array = Arrays.stream(arr).map()
		int [] result1 =  removeFromArrayWithIndex(arr, index);
		System.out.println(Arrays.toString(result1));
		
		
	}

	private static int[] removeFromArrayWithIndex(int[] arr, int index) {
		int[] result = new int[arr.length-1];
		for(int i =0 ; i<arr.length -1; i++) {
			if(index ==i) {
				result[i] = arr[i+1];
			}else {
				result[i] = arr[i];
			}
		}
		return result;
	}

	private static Boolean checkTheBacket(String str) {
		Stack<Character> stack = new Stack<Character>();
		char[] chars = str.toCharArray() ;
		for(char ch :chars) {
		if(ch=='{' || ch =='[' || ch =='(') {
			stack.push(ch);
		}else if (ch=='}' && '{'==stack.peek()) {
			stack.pop();
		}else if (ch==']' && '['==stack.peek()) {
			stack.pop();
		}else if (ch==')' && '('==stack.peek()) {
			stack.pop();
		}
		
		
		}
		return stack.empty();
	}

}
//int [] removeFromArrayWithIndex(int[] inputArray, int indexToBeRemoved)

//{3,1,2,5,4},3 --> {3,1,2,4}
//{3,1,2,5,4},0 --> {1,2,5,4}


