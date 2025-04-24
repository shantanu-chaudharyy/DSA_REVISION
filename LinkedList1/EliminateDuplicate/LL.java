package LinkedList1.EliminateDuplicate;

import java.util.Scanner;

public class LL {

    // Node class
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

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
    public static Node<Integer> EliminateDuplicate(Node<Integer> head) {
        
        if(head == null) {

            return head;
        }

        Node<Integer> temp = head;
        while (temp != null && temp.next != null) {

            if(temp.data.equals(temp.next.data)) {

                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return head;
}


    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node<Integer> head = TakeInput();
        
        head = EliminateDuplicate(head);
        print(head);
    }
}
