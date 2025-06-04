package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntIngdfg {

	public static void main(String[] args) {
		/*List<Emp> list = new ArrayList<Emp>();
		Emp emp1 = new Emp("1", "sunny");
		Emp emp2 = new Emp("2", "Hunny");
		Emp emp3 = new Emp("5", "ram");
		Emp emp4 = new Emp("3", "syham");
		Emp emp5 = new Emp("4", "raju");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		// sort by id  
		
		List<Emp> collect = list.stream().sorted(Comparator.comparing(Emp ::getId)).collect(Collectors.toList());
		System.out.println("ASC order " + collect);
		
		//
		
		List<Emp> collect1 = list.stream().sorted(Comparator.comparing(Emp ::getId).reversed()).collect(Collectors.toList());
		System.out.println("Desc order " + collect1);
		*/
		int[] arr = {1,2,3,5,6,8};
		
	List<Integer> list = new ArrayList<Integer>();
	for(int i = 1 ;i<arr.length ; i++) {
		int current = arr[i];
		int previous = arr[i-1];
		for(int j =previous+1 ;j<current ; j++ ) {
			list.add(j);
		}
	}
		
	System.out.println(list);	
		
		
	
//	    int[] missingElement = findmisingElemnet(arr);
	//	System.out.println(Arrays.toString(missingElement));
		
	}

	
	
	
}


class Emp {
private String id ; 
private String name ;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Emp(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
} 

	
}
