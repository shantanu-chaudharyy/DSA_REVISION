package LinkedList1.ReverseALinkedlist_Easy;

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


        Node<Integer> SmallOutput = TheprintReverse(root);
    }
    public static Node<Integer> TheprintReverse(Node<Integer> node) {
    
        if(node == null ) {

            return node;
        }

        Node<Integer> SmallOutput = TheprintReverse(node.next);
        System.out.print(node.data + " ");
        return SmallOutput;
    }
    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node<Integer> root = TakeInput();

        printReverse(root);
        
    }
}


