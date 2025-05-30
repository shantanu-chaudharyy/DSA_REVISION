package LinkedList2.LectureQuestion.PrintLLRecursive;

import java.util.Scanner;

public class LL {
    public static Node<Integer> takeInput() {
            Scanner s = new Scanner(System.in);
            int data = s.nextInt();
    
            Node<Integer> head = null, tail = null;
    
            while (data != -1) {
                Node<Integer> newNode = new Node<Integer>(data);
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

        public static void PrintLLRecursive(Node<Integer> head) {

            if(head == null) {
                return;
            }

            System.out.print(head.data + " ");
            PrintLLRecursive(head.next);
            return;
        }

        public static void main(String[] args) {
            
            Node<Integer> head = takeInput();
            PrintLLRecursive(head);
        }
}
