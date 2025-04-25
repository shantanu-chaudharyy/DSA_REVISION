package LinkedList1.CheckPalindrome;

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
        Node<Integer> newHead = null;

        while (head != null) {
            Node<Integer> newNode = new Node<>(head.data);
            newNode.next = newHead;
            newHead = newNode;
            head = head.next;
        }

        return newHead;
    }

    // ✅ Function to check if linked list is a palindrome
    public static boolean isPalindrome(Node<Integer> head) {
        Node<Integer> reversed = reverseCopy(head);
    
        while (head != null && reversed != null) {
            if (head.data != reversed.data) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
    
        return true;
    }
    // ✅ Main method
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.println(isPalindrome(head));
    }
}
