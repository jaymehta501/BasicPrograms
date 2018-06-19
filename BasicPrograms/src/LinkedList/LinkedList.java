package LinkedList;

import java.util.Scanner;

class Node{
		
	int data;
	Node next;
		
	Node(int d){
		data = d;
		next = null;			
	}
}

public class LinkedList{	
	
	Node head = null;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//int usrNum = 0;
		
		LinkedList lst = new LinkedList();
		lst.createList();
		lst.printList();
		
		/*
		while (usrNum != 20) {
		System.out.println("************************************");
		System.out.println("1. Create List.");
		System.out.println("2. Insert After");		
		System.out.println("Enter your choice : ");
		System.out.println("************************************");
		}
		*/
	}
	
	void createList() {
		
		int usrNum1 = 0;
		int data;
		Node new_node;
		Node current_node = null;
		
		do{
			System.out.println("Enter data you would like to put in the node.");
			data = sc.nextInt();
			
			new_node = new Node(data);
			new_node.next = null;
			
			if (head == null) {
				
				head = new_node;
				current_node = new_node;
			} else {
				
				current_node.next = new_node;
				current_node = new_node;
			}
			
			System.out.println("Would you like to enter node in the list. /n 1 -> Yes /n 2 -> No");
			usrNum1 = sc.nextInt();
			
		} while (usrNum1 != 2);
		
	}
	
	void printList() {
		
		Node currNode = null;
		
		while(currNode.next != null) {
			
			System.out.println(currNode.data + " -> ");	
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
}

