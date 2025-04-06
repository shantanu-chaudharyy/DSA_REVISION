package LinkedList1.printAndUpdate;

import java.util.Scanner;

public class LinkedListuse {

    // Method to build the linked list from input
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();  // Read first data

        Node<Integer> head = null; // Head points to first node
        Node<Integer> tail = null; // Tail helps in appending efficiently

        // Read until -1 (sentinel to stop input)
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data); // Create a new node

            if (head == null) {
                // First node, initialize head and tail
                head = newNode;
                tail = newNode;
            } else {
                // Link new node at the end and update tail
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt(); // Read next value
        }

        return head; // Return the head of the list
    }

    // Method to update the node at target index and print the full list
    public static void output(Node<Integer> head, int targetIndex, int newValue) {
        int count = 0;           // To keep track of current index
        Node<Integer> temp = head;

        while (temp != null) {
            if (count == targetIndex) {
                // If current index matches the target, update the data
                temp.data = newValue;
            }

            System.out.print(temp.data + " "); // Print current node data
            temp = temp.next;   // Move to next node
            count++;            // Increment index
        }
    }

    // Main method: entry point
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1: Build the linked list
        Node<Integer> head = takeInput();

        // Step 2: Read the target index and value to update
        int targetIndex = s.nextInt();
        int newValue = s.nextInt();

        // Step 3: Update the list and print it
        output(head, targetIndex, newValue);
    }
}