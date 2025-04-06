package LinkedList1.Printing_Linkedlist;

import java.util.Scanner;

public class LinkedlistUse {
	
	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt(); // 1 
				
		while(data != -1){ // -1
			Node<Integer> newNode = new Node<Integer>(data); // 1-@10  ,2-@20 ,3-@30
			if(head == null){ 
				head = newNode; // @10
				tail = newNode; // @10
			}else{
			
				tail.next = newNode; //@30
				tail = newNode; // @30
			}
			data = s.nextInt(); //-1
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		print(head);
		
	}
}
