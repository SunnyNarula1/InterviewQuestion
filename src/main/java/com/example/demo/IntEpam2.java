package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class IntEpam2 {
	public static void main(String[] args) {
		// FIND PRIME FACTORS OF A NUMBER

//	Input : 12 %2 = 0 ;

//	output : 2 2 3

		int a = 35; // 7, 5

		List<Integer> result = findthePrimeFactor(a);
		System.out.println(result);

	}

	private static List<Integer> findthePrimeFactor(int a) {
		List<Integer> list = new ArrayList<Integer>();

		while (a%2 == 0) {
			list.add(2);
			a = a / 2;
		}
		for (int i = 3; i*i<=a; i+=2) {
			while(a%i==0) {
				list.add(i);
				a/=i;
			}

		}
		if(a>2) {
			list.add(a);
		}
		return list;
	}

}
