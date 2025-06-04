package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntCor2 {
	public static void main(String[] args) {
		String str = "hello world";
		//aeiou    //hollo werld 
		
		String resultstr = replaceVowelwithString(str);
		String result = repplaceVowel(str) ;
		System.out.println(result);
		System.out.println(resultstr);
		List<Employese> list = new  ArrayList<>();
		
		Employese emp1 = new Employese("1" ,"sunny");
		Employese emp2 = new Employese("2" ,"hunny");
		Employese emp3 = new Employese("3" ,"ram");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		//sorted name reversed order
		
		
		
		List<Employese> collect = list.stream().sorted(Comparator.comparing(Employese ::getEmpName).reversed()).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static String replaceVowelwithString(String str) {
		StringBuilder result = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(isVowel(ch)) {
				result.append("av");
			}else {
			result.append(ch);
		}}
		return result.toString();
	}

	private static String repplaceVowel(String str) {
		int left  =0  ;
		
		char[] ch = str.toCharArray();
		int right = ch.length-1 ;
		while(left <right) {
			if(!isVowel(ch[left])) {
				left ++ ;
			}else if(!isVowel(ch[right])) {
				right--;
			}else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left ++ ;
				right --;
			}
			
		}
		return new String(ch);
		
	}

	private static boolean isVowel(char charAt) {
		
		return "aeiou".indexOf(charAt) !=-1 ;
	}
}
class Employese {
	
	
	private String empName ; 
	private String empId ;
	public Employese(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employese [empName=" + empName + ", empId=" + empId + "]";
	} 
	
	
	
}











