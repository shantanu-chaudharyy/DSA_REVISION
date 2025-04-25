package LinkedList1.AppendLastNthDigit;

import java.util.Scanner;

public class LL {

    // Function to take input from user
    public static Node<Integer> TakeInput() {
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

    // Function to print list
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Function to append last N to front
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if (head == null || n == 0) return head;

        // Step 1: Find length
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        if (n >= length) {
            return head;
        }
        int splitPoint = length - n;
        Node<Integer> prev = null;
        Node<Integer> current = head;

        for (int i = 0; i < splitPoint; i++) {
            prev = current;
            current = current.next;
        }

        Node<Integer> newHead = current;
        prev.next = null;

        // Move to tail of newHead
        Node<Integer> tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;

        return newHead;
    }

    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node<Integer> head = TakeInput();
        int n = s.nextInt();

        head = appendLastNToFirst(head, n);
        print(head);
    }
}
