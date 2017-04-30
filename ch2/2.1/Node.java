/*
	Problem 2.1
	
	Remove Dups! Write code to remove duplicates from an unsorted linked list
	How would you solve this problem if a temporary bu er is not allowed?
*/

import java.util.*;

public class Node{
	Node next = null;
	int data;
	
	public Node(int data){
		this.data = data;
	}

	public void appendToTail(int data){
		Node node = new Node(data);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = node;
	}
	
	public void printList(){
		Node n = this;
		while(n != null){
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println();
	}
	
	public void removeDuplicates(){
		Node current = this;
		while(current != null){
			Node runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(3);
		System.out.print("Before:\t");
		head.printList();
		head.removeDuplicates();
		System.out.print("After:\t");
		head.printList();		
	}
}
