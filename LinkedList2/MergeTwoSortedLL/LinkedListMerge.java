package LinkedList2.MergeTwoSortedLL;

import java.util.Scanner;

public class LinkedListMerge {

    // Function to take linked list input from user until -1 is entered
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        // Keep adding new nodes until user enters -1
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                // First node becomes both head and tail
                head = newNode;
                tail = newNode;
            } else {
                // Add new node to the end and update tail
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head; // Return the head of the created linked list
    }

    // Function to merge two sorted linked lists into one sorted list
    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        // If either list is empty, return the other one
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
    
        Node<Integer> t1 = head1;
        Node<Integer> t2 = head2;
        Node<Integer> head = null, tail = null;
    
        // Initialize head and tail with the smaller first node
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
    
        // Merge the lists by comparing data from both lists
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
    
        // Attach remaining nodes of the non-empty list
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
    
        return head; // Return the head of the merged linked list
    }

    // Function to print a linked list
    public static void Print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Take two sorted linked list inputs from the user
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();

        // Merge the two sorted linked lists
        Node<Integer> head = merge(head1, head2);

        // Print the final merged linked list
        Print(head);
    }
}
