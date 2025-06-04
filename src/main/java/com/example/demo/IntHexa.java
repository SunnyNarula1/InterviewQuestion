package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntHexa {
	public static void main(String[] args) {
		
	//itc cleint interview //Gartner 
	List<String> myData = Arrays.asList("a", "a", "b", "c","e");
	//Map a:2 , b:1
	
	Map<String, Long> collect = myData.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
	//map to list using stream
	
	List<String> restoredList = collect.entrySet()
		    .stream()
		    .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
		    .collect(Collectors.toList());

	
	
	System.out.println("using stream " + restoredList);
	System.out.println(collect);
	
	List<String> lsit = new  ArrayList<String>();
	Iterator<Entry<String, Long>> iterator = collect.entrySet().iterator();
	
	while(iterator.hasNext()) {
		Entry<String, Long> next = iterator.next() ;
		Long tem = next.getValue();
	  for(int i =0 ; i<tem ;i++) {
		lsit.add(next.getKey());
	   }
	}
	System.out.println(lsit);
		
	//end to point to upload file 
	/*class emp implemetation Seriable{
		private static final seial
		private String empId ; 
		private String empName ; 
	}
	
//race parall two thread which access to same method 
	

	
	class Mainx {
		public static void main(String[] args) {
			add(3,4);
		}
	
		private static synchronized  int add(int a , int b) {
			return a+b ; 
		}
	
	
		private static int add(int a , int b) {
		synchronized (Mainx.class) {
			int tem =  a+b ; 
		}
			return tem ;
		}
	
	
	
	Thread t1 = new Thread(()->{
		add(3, 4) ; 
		
	});
	
	Thread t2 = new Thread(()->{
		add(3, 4) ; 
		
	});
	
	}	
}

    // user name and password  -:- generate token 	and 
	
	// token auth claims  retuunr username  in secuitiry 
	
	
	//add spring secuity add jwt dependec

	
	
	
	
	
	
*/	
}
}