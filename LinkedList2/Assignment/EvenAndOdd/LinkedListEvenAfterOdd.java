package LinkedList2.Assignment.EvenAndOdd;

import java.util.Scanner;

public class LinkedListEvenAfterOdd {

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

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> oddHead = null, oddTail = null;
        Node<Integer> evenHead = null, evenTail = null;
        Node<Integer> current = head;

        while (current != null) {
            if (current.data % 2 != 0) { // Odd
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            } else { // Even
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            }
            current = current.next;
        }

        if (oddTail != null) {
            oddTail.next = evenHead;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }

        if (oddTail != null) {
            oddTail.next = evenHead;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }

        if (oddHead != null) {
            return oddHead;
        } else {
            return evenHead;
        }

    }

    public static void printList(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = evenAfterOdd(head);
        printList(head);
    }
}
