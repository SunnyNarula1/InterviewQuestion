package com.example.demo;

public class IntRen {
	LinkedListNode head ;
	LinkedListNode tail ;
//order //4 -> 5 -> 6 -> 7 ->

public  void add(int val) {
	LinkedListNode listNode = new LinkedListNode(val);
	if(head == null) {
		head = tail = listNode;
	}else {
		tail.next = listNode;
		listNode.preve = tail ;
		tail = listNode ;
	}
}

public void  reveserLinkedlist() {
	// TODO Auto-generated method stub
	LinkedListNode current = head;
	LinkedListNode temp = null;
	while(current!= null) {
		temp = current.preve;
		current.preve = current.next;
		current.next = temp ; 
		current = current.preve;
	}
	
	if(temp != null) {
		head = temp.preve;
	}
	
	current = head ;
	while(current != null && current.next != null) {
		current = current.next;
	}
	
	tail = current;
}

public void printBackward() {
	LinkedListNode nodeTemp  = tail;
	while(nodeTemp != null) {
		System.out.print(nodeTemp.val + " <- ");
		nodeTemp = nodeTemp.preve;
	}
	System.out.println();
}


public void printForwaordLinkedList() {
	LinkedListNode nodeForwardTemp = head ;
	while(nodeForwardTemp != null) {
		System.out.print(nodeForwardTemp.val + " -> ");
		nodeForwardTemp = nodeForwardTemp.next;
	}
	System.out.println();
}

}

