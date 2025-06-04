package com.example.demo;

import java.util.stream.IntStream;

public class IntW {
public static void main(String[] args) {
	

	String str = "sunny";
	//s :1 , u =1 , n=2 ,y =1
	
	//s ,u,y
	//s 
	/* str.chars().mapToObj(c->(char) c)
	.collect(Collctors.GroupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet()
	.stream().filter(entry-> etry.getValue()==1)
	.map(Map.Entry::getKey)
	.findFirst(); */
	 
	 
/*	 //print Numbers 1 to 100 . 
	 print numbers from 1 to 100. and in between while prining the number ,
	 if num/3 then Print Java. If num/5 then Print Programming. 
	 If num/3 &num/5 then print "Java Programming" using java8 */
	 
	 IntStream.range(0, 101).boxed().forEach(i->{
		 if(i%3==0) {
			 System.out.println("Java");
		 }else if(i%5==0) {
			 System.out.println("Prgraming");
		 }else if (i%3==0 && i%5==0)	{
			 System.out.println("Java Programming");
		 }else {
			 System.out.println(i);
		 }
	 });

	
	 
	 
	 
}
}
