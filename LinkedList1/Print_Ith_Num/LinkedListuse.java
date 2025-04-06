package LinkedList1.Print_Ith_Num;

import java.util.Scanner;


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

    // Method to print the entire linked list
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1: Build the list
        Node<Integer> head = takeInput();

        // Step 2: Print the value
        print(head);

    }
}
