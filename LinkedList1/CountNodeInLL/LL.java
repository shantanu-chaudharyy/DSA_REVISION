package LinkedList1.CountNodeInLL;

import java.util.Scanner;

public class LL {

    // Function to take input from the user and build the linked list
    public static Node TakeInput() {

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node head = null, tail = null;

        // Keep taking input until -1 is entered
        while (data != -1) {

            // Create a new node with the input data
            Node NewNode = new Node(data);

            // If list is empty, initialize both head and tail
            if (head == null) {
                head = NewNode;
                tail = NewNode;
            } else {
                // Else add the new node to the end and update the tail
                tail.next = NewNode;
                tail = NewNode;
            }

            data = s.nextInt(); // Take next input
        }

        return head; // Return the head of the constructed linked list
    }

    // Function to print the linked list
    public static void print(Node head) {

        // Traverse through the list
        while (head != null) {
            System.out.print(head.data + " "); // Print current node's data
            head = head.next; // Move to the next node
        }
        System.out.println(); // New line after list ends
    }

    // Function to count the number of nodes in the linked list
    public static int Count(Node head) {

        Node temp = head; // Start from the head
        int count = 0;

        // If the list is empty, return 0
        if (head == null) {
            return count;
        }

        // Traverse the list and increment the counter
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count; // Return the total number of nodes
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Create the linked list by taking input from the user
        Node head = TakeInput();

        // Count and print the number of nodes
        System.out.println(Count(head));

        // Optional: print the list
        // print(head);
    }
}
