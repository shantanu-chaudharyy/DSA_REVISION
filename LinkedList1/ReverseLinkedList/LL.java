package LinkedList1.ReverseLinkedList;

import java.util.Scanner;

public class LL {
    
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
    
    public static void printReverse(Node<Integer> root) {

        Node<Integer> SmallOutput = PrintReverseLL(root); 
     
    }

    public static Node<Integer> PrintReverseLL(Node<Integer> head) {

        if(head == null) {

            return head;
        }

        Node<Integer> current = head;
        Node<Integer> prev = null;
    
        while(current != null) {

            Node<Integer> temp = current.next; 

            current.next = prev;
            prev = current;
            current = temp;
        }

        while(prev != null) {

            System.out.print(prev.data + " ");
            prev  = prev.next;
        }
        return prev;
    }
    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node<Integer> root = TakeInput();

         printReverse(root);

        
    }
}


