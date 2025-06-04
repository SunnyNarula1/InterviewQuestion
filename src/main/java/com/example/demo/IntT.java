package com.example.demo;

public class IntT {
public static void main(String[] args) {
	
	      int[] arr = {1,2,3,4,5};
	      int n = 4 ;
	      int result = binarySerech(arr , n);
	      System.out.println(result);
}
	  public static int binarySerech(int[] arr , int n){
	    int left = 0 ;
	    int right = arr.length -1;
	  
	   
	    while(left <= right){
	    	 int mid = left + (right - left)/2 ;
	       if(arr[mid] == n){
	         return mid;
	       }else if (arr[mid] < n) {
	    	   left = mid +1;
	       }else {
	    	   right = mid -1 ;
	       }
			
		}
		return -1;
	     
}
}
/*class base{

Base(String s){

system.out.println("parameterised constructor is called");   }

}


public class Derived extends Base{

  Derived(){
system.out.println("default constrcutor is called"); }

public static void main(String args[]){

  Base obj= new Derived();
}

}*/
