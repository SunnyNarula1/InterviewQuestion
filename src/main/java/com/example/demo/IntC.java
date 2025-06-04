package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntC {
//	Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
	//		Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
	public static void main(String[] args) {
		
	
	
	List<String> list = new ArrayList();
	list.add("eat");
	list.add("tea");
	list.add("tan");
	list.add("ate");
	list.add("nat");
	list.add("bat");
	
	
	Map<String, List<String>> collect = list.stream().map(i->(String)i).collect(Collectors.groupingBy(str->{
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
		
	}));
	
	
	System.out.println(collect.values());
	
	}	
	
	
	 //vechile 
	// parking lot 
	//parking sport [ ]
	// parking avaiable 
	// parling aloted 
	// remove vechile
	
	// class vechile 
	
	// uuid id ,String vechile no , String vechlietyep  ; String pakingType; time
	
//	class owne 
	//uuid userid  , string owne name , String faltNo , String owenContract 
	
	//class pakinglot 
	// uuuid  id , String pakingType , List<pakingSport> list ;
	
	// class PakingSport 
	// uuid id , uuid userid  , boolean isoccupaice ;(true,false) (true ) 
	
	
	
/*	pakingAllocationDto
	{
		private User use ; 
		private pakingSport
	}
	*/
// interface paking
//	avaible(uuid pakinglotid  ) -> repo  //getbyId(pakingid ) // queery list 
//	pakingallotated  post create( ) 
//	existing() ( uuid paking)// exist updated 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
