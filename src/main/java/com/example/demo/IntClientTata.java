package com.example.demo;
import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IntClientTata {
	
	public static void main(String[] args) {
		
		//Emp class id , name , salary ,age 
		//List<Emp>  //which salry >1000 and age <25 
		
		
		
		List<Employees> list = new ArrayList<>();
		Employees emp1 = new Employees(1, "sunny", "15000", "19");
		Employees emp2 = new Employees(2, "hunny", "10000", "20");
		Employees emp3 = new Employees(3, "ram", "16000", "28");
		Employees emp4 = new Employees(4, "gour", "9000", "19");
		Employees emp5 = new Employees(5, "vikas", "11000", "29");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		List<Employees> collect = list.stream().filter(i->Integer.parseInt(i.getAge())<25 && Integer.parseInt(i.getSalary())>10000).collect(Collectors.toList());
		System.out.println(collect);
	/*	input: n = 2
				Output: 2
				Explanation: There are two ways to climb to the top.
				1. 1 step + 1 step
				2. 2 steps
				Example 2:
				 
				Input: n = 3
				Output: 3
				Explanation: There are three ways to climb to the top.
				1. 1 step + 1 step + 1 step
				2. 1 step + 2 steps
				3. 2 steps + 1 step
				*/
		
		int n = 4 ;// 1,1,1,1 ,2,1,1 ,  1,1,2,   1,2,1 ,  2,2
		int stepcount = findcountStep(n);
		System.out.println(stepcount);
		
	}

	private static int findcountStep(int n) {
	   
	   
	    if(n==1) {
			return 1 ;
		}
		if(n==2) {
			return 2 ;
		}
		
		return  findcountStep(n-1)+findcountStep(n-2);
	}
}


