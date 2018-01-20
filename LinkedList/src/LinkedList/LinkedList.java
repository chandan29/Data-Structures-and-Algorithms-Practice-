package LinkedList;

import java.awt.List;

public class LinkedList {
	Node first=null,last=null,newFirst=null,nF=null;
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		return false;
	}
	
	public void insertFirst(int n1) {
		Node n=new Node();
		n.value=n1;
		if(first!=null) {
		
		n.value=n1;
		n.next=first;
		first.prev=n;
		first=n;
		Node current=first;
		while(current.next!=null) {
			
			current=current.next;
		}
		last=current;
		}
		else {
			first=n;
			last=n;
		}
		
	}
	
	public int insertLast(int n1) {
		Node n=new Node();
		n.value=n1;
		if(last!=null) {
		Node current=last;
		last=n;
		n.prev=current;
		current.next=n;
		}
		else {
			
			first=n;
			last=n;
		}
		return n1;
	}
	
	public void deleteFirst() {
		Node current=first;
		first=first.next;
		first.prev=null;
		current.next=null;
	}
	
	public void deleteLast() {
		Node current=last;
		last=last.prev;
		last.next=null;
		current.prev=null;
	}
	
	public void display() {
		Node current=last;
		while(current!=null) {
			System.out.println(current.value);
			current=current.prev;
		}
	}
	
	
	public void reverseBetter() {
		int length=0;
		Node current=first,tf=first,tl=last;
		while(current!=null) {
			current=current.next;
			length++;
		}
		int runs=length/2;
		int temp;
		for(int i=0;i<runs;i++) {
			temp=tf.value;
			tf.value=tl.value;
			tl.value=temp;
			tf=tf.next;
			tl=tl.prev;
		}
		
	}
	
	
	public void reverseList() {
		Node newfirst=new Node();
		newfirst=last;
		nF=newfirst;
		Node current=last.prev;
		while(current!=null) {
			Node n=new Node();
			n.value=current.value;
			newfirst.next=n;
			current=current.prev;
			newfirst=newfirst.next;
		}
		current=nF;
		while(current!=null) {
			System.out.println(current.value);
			current=current.next;
		}
	}
}
