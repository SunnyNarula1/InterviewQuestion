package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntAltermic {
public static void main(String[] args) {
	//1) How do you find frequency of each element in an array or a list?
			List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

			//out : pen:2 , Eraswe: 1 

			Map<String ,Long> result = stationeryList.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));

			System.out.println(result) ;




			 
			//2) Find sum of all digits of a number in Java 8?
			int i = 15623;
			//out:- sum  
			  int sum =   String.valueOf(i).chars().map(c->c-'0').sum();
			System.out.println(sum) ;







		//	3) Given a list of strings, sort them according to increasing order of their length?
			List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C") ;
			//out:- c , c#  , 



			 List<String> result1 = listOfStrings.stream().sorted(Comparator.comparing(String ::length)).collect(Collectors.toList());
			System.out.println(result1);

			 
		/*	4) Detect Large Cash Withdrawals from Digital Wallets
			 
		//write jpa query 
			Given a List<WalletTransaction>:
			 
			class WalletTransaction {
			    String userId;
			    double amount;
			    boolean isWithdrawal;
			}
			 
			Identify users who withdrew more than $5000 in a single transaction.


			  @Query(Select a from WalletTransaction a where a.amount > 5000);
			 
			  @Query("SELECT DISTINCT w.userId FROM WalletTransaction w WHERE w.isWithdrawal = true AND w.amount > 5000")
              List<String> findUsersWithLargeWithdrawals();

			Return a List<UserId>.
			 
			5) write SQL query to fetch second maximum salary from the salary table
			//write sql query



			select distinct  salary from salary_table order by salary DESC Limit 1 offset 1 ; 
			
			*/
			
			






}
}
