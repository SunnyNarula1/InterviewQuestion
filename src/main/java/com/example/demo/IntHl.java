package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntHl {
	
	static {
		System.out.println("static block");
	}
	
	public IntHl(){
		System.out.println("constructor block");
	}
	{
		System.out.println("normal block");
	}
public static void main(String[] args) {
	
	new IntHl();
	new IntHl();
	

	List<List<String>> ls = Arrays.asList(

			Arrays.asList("sunny" ,"jhon smint"),
			Arrays.asList("sunny" ,"jhon smint"),
			Arrays.asList("sunny" ,"jhon smint"),
			Arrays.asList("sunny" ,"jhon smint")
			);
	List<String> collect = ls.stream().flatMap(List::stream).filter(obj->obj.startsWith("j")).collect(Collectors.toList());
	System.out.println(collect);
}
}