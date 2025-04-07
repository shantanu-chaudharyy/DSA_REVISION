package LinkedList1.DeleteTheNode;

import java.util.Scanner;

public class LL {

    // Function to take input from the user and build the linked list
    public static Node<Integer> TakeInput() {

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        // Input continues until -1 is entered
        while (data != -1) {

            // Create a new node with the entered data
            Node<Integer> NewNode = new Node<Integer>(data);

            // If list is empty, initialize head and tail with the new node
            if (head == null) {
                head = NewNode;
                tail = NewNode;
            } else {
                // Otherwise, attach new node to the end of the list and update tail
                tail.next = NewNode;
                tail = NewNode;
            }

            // Take next input
            data = s.nextInt();
        }

        return head; // Return the head of the linked list
    }

    // Function to print the linked list
    public static void print(Node<Integer> head) {

        // Traverse and print each node's data
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(); // Print new line after list ends
    }

    // Function to delete a node at a given position (0-based indexing)
    public static Node<Integer> Delete(Node<Integer> head, int pos) {

        // If list is empty, just return
        if (head == null) {
            return head;
        }

        // Special case: if position is 0, delete the head node
        if (pos == 0) {
            return head.next;
        }

        Node<Integer> TEMP = head;
        int count = 0;

        // Traverse the list to reach (pos - 1)-th node
        while (TEMP != null && count < pos - 1) {
            TEMP = TEMP.next;
            count++;
        }

        // If TEMP is valid and the next node exists, remove the next node
        if (TEMP != null && TEMP.next != null) {
            TEMP.next = TEMP.next.next; // Bypass the node at position `pos`
        }

        return head; // Return updated head of the list
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Build the linked list from user input
        Node<Integer> head = TakeInput();

        // Take the position to delete from the user
        int pos = s.nextInt();

        // Delete the node at that position
        head = Delete(head, pos);

        // Print the updated linked list
        print(head);
    }
}
