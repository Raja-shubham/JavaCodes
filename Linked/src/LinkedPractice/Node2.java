package LinkedPractice;

import LinkedPractice.Node1.Node;

public class Node2 {

	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	static void add(int data) {
		Node newNode = new Node(data); 
		if(head==null) {
			newNode.next=head;
			head=newNode;
		}
		else {
			Node t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=newNode;
			newNode.next=null;
		}
	}
	
	static void display() {
		Node t=head;
		if(head==null) {
			System.out.println("Empty Linked List ");
		}
		while(t!=null) {
			System.out.println(t.data+" ");
			t=t.next;
		}
	}
	
	static void insertAt(int position,int data) {
		Node newNode=new Node(data);
		Node t=head;
		int count=1;
		while(count!=position && t.next.next==null) {
			t=t.next;
			count++;
		}
		if(t.next==null)
			System.out.println("invalid Position");
		newNode.next=t.next;
		t.next=newNode;
	}
	static void deleteFront() {
		Node temp=head;
		head=head.next;
	}
	static void deleteEnd() {
		Node t=head;
		while(t.next.next!=null) {
			t=t.next;
		}
		t.next=null;
	}
	static void deletePosition(int position) {
		Node t=head;
		int count=0;
		while(count!=position-1) {
			t=t.next;
			count++;	
		}
		Node t1=t.next;
		t.next=t1.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node2 list=new Node2();
		list.add(2);
		list.add(3);
		list.add(4);
		//list.insertAt(3, 1);
		list.deletePosition(2);
		list.display();
	}

}
