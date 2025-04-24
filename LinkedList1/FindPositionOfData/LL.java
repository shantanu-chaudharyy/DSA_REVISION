package LinkedList1.FindPositionOfData;

import java.util.Scanner;

public class LL {

    // Method to take linked list input from the user until -1 is entered
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;

        // Keep reading data until -1 is entered
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data); // Create a new node

            if (head == null) {
                // If it's the first node, initialize head and tail
                head = newNode;
                tail = newNode;
            } else {
                // Otherwise, attach the new node to the tail and update the tail
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt(); // Read next input
        }

        return head; // Return the head of the linked list
    }

    // Method to find the position of a given value in the linked list
    // Returns the 0-based index or -1 if not found
    public static int FindPosition(Node<Integer> head, int Data) {
      

        int count = 0;
        Node<Integer> temp = head;

        // Traverse the list to find the target value
        while (temp != null) {
            if (temp.data == Data) // we also use if(temp.data.equals(Data))  
            {
                return count; // Found the element, return its index
            }
            temp = temp.next;
            count++;
        }

        return -1; // Element not found
    }
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1: Build the linked list
        Node<Integer> head = takeInput();

        // Step 2: Take the value to search for
        int Data = s.nextInt();

        // Step 3: Find the position of the value
        int result = FindPosition(head, Data);

        // Step 4: Print the result
        System.out.println(result);

    }
}
