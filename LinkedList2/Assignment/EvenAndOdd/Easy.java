package LinkedList2.Assignment.EvenAndOdd;

import java.util.Scanner;

public class Easy {
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
        Node<Integer> node = head, evenNode = null, oddNode = null, oddHead = null, evenHead = null;
        while (node != null) {
            int data = node.data;

            if (data % 2 == 0) {

                if (evenNode == null) {

                    evenNode = node;
                    evenHead = node;
                } else {
                    evenNode.next = node;
                    evenNode = evenNode.next;
                }

            } else {

                if (oddNode == null) {

                    oddNode = node;
                    oddHead = node;
                } else {
                    oddNode.next = node;
                    oddNode = oddNode.next;
                }

            }

            node = node.next;
        }

        if (oddHead == null) {
            return evenHead;
        } else {
            oddNode.next = evenHead;
        }

        if (evenNode != null) {
            evenNode.next = null;
        }

        return oddHead;
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
