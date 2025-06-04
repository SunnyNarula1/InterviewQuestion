package com.example.demo;

public class IntMap {
	
	public static void main(String[] args) {
		int a = 9875;
		
	int result = 	findSingleDigitSum(a);
	System.out.println(result);
	
	int result1 = recusiveApproch(a);
		System.out.println("recusion " +result);
		
	}

	private static int recusiveApproch(int a) {
		int sum = 0 ;
		if(a>0 && a<9) {
			return a ;
		}
		while(a>0) {
			sum +=a%10 ;
			a= a/10;
		}
		a=sum ;
		return recusiveApproch(a);
	}

	private static int findSingleDigitSum(int a) {
		
		while(a>=10) {
			int sum = 0 ; 
			while(a>0) {
			sum +=a%10;
			a= a/10;
		}
		
		a= sum;
		}
		return a;
	}
	

}
