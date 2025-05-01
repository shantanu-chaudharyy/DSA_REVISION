package Rough;

import java.util.Scanner;

public class LL {

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    // ✅ Function to reverse a copy of the linked list
    public static Node<Integer> reverseCopy(Node<Integer> head) {
      
        Node<Integer> prev = null;
        Node<Integer> current = head;

        while(current != null) {

            Node<Integer> temp = current.next;

            current.next = prev;
            prev = current;
            current = temp; 
        }
        return prev;
    }

    // ✅ Function to check if linked list is a palindrome
    public static boolean isPalindrome(Node<Integer> head) {
       
        // reverseCopy(head) is pre-made library which reverse the linkedlist
        Node<Integer> Reverse = reverseCopy(head);

        while(head != null && Reverse != null) {

            if(!head.data.equals(Reverse.data)) {

                return false;

            }
            head = head.next;
            Reverse = Reverse.next;
        }
        return true;
    }
    // ✅ Main method
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.println(isPalindrome(head));
    }
}
