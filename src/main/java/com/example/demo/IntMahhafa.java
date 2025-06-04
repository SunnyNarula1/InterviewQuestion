package com.example.demo;

public class IntMahhafa {
public static void main(String[] args) {
	String str = "1234567891";


	//Result = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9  + 1   =  46  >>>>  4 + 6  = 10  >>>>  1 + 0 = 1
	Integer a = Integer.parseInt(str);
	System.out.println(singleDigitSum(a));
}
	private static int singleDigitSum(Integer a) {

	while(a>=10){   //12
	int sum = 0 ; 
	while(a>0){ 
	sum +=a%10 ;  
	a= a/10 ;  
	}
	a= sum ;
	}
	return a ;
}
	
	

	
	
	
	
	
}
