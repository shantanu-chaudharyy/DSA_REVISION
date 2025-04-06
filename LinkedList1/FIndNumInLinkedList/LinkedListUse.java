package LinkedList1.FIndNumInLinkedList;

import java.util.Scanner;


public class LinkedListUse {
   
   // Generic Node class for Linked List
    class Node<T> {
        T data;          // Data part of the node
        Node<T> next;    // Pointer to the next node
    
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class LinkedListuse {
    
        // Method to take linked list input until -1 is entered
        public static Node<Integer> takeInput() {
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
    
            Node<Integer> head = null;
            Node<Integer> tail = null;
    
            while (data != -1) {
                Node<Integer> newNode = new Node<>(data); // Create a new node
    
                if (head == null) {
                    // If it's the first node, initialize head and tail
                    head = newNode;
                    tail = newNode;
                } else {
                    // Append at the end
                    tail.next = newNode;
                    tail = newNode;
                }
    
                data = sc.nextInt(); // Read next input
            }
    
            return head; // Return the head of the list
        }
            
        // Method to print the data at the i-th index
        public static void output(Node<Integer> head, int i) {
            int count = 0;
    
            // Traverse until count == i or we reach the end
            while (count != i && head != null) {
                head = head.next;
                count++;
            }
    
            // If count == i and head is not null, print the data
            if (count == i && head != null) {
                System.out.println(head.data);
            }
        }
    
        // Main method
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            // Step 1: Build the list
            Node<Integer> head = takeInput();
    
            // Step 2: Read the index
            int i = s.nextInt();
    
            // Step 3: Output the i-th node's data
            output(head, i);
        }
    }
       

}