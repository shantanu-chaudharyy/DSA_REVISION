package LinkedList2.MergeTwoSortedLL;

import java.util.Scanner;

public class LinkedListMerge {
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

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
    
        Node<Integer> t1 = head1;
        Node<Integer> t2 = head2;
        Node<Integer> head = null, tail = null;
    
        // Initialize head and tail
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
    
        // Merge until one list finishes
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
    
        // Attach the remaining part
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
    
        return head;
    }
    public static void Print(Node<Integer> head) {

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

        public static void main(String[] args) {
            
            Node<Integer> head1 = takeInput();
            Node<Integer> head2 = takeInput();

            Node<Integer> head = merge(head1, head2);
            Print(head);
            
        }
    }