package com.example.demo;

public class TestLinkedList {
	public static void main(String[] args) {
		IntRen ren = new IntRen() ;
		ren.add(4);
		ren.add(5);
		ren.add(6);
		ren.add(7);
		
		ren.printForwaordLinkedList();
				
		ren.reveserLinkedlist();
		
		ren.printForwaordLinkedList();
		
}

}
