package LinkedList2.LectureQuestion.InsertElementRecursive;

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
        public static Node<Integer> PrintLL(Node<Integer> head ,int pos , int ele) {
            if (pos < 0) return head; // invalid position
        
            if (pos == 0) {
                Node<Integer> Newnode = new Node<>(ele);
                Newnode.next = head;
                return Newnode;
            }
        
            // Edge case fix:
            if (head == null) return head;
        
            head.next = PrintLL(head.next , pos - 1, ele);
            return head;
        }
        public static void Print(Node<Integer> head) {
            while(head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
           
        
            Node<Integer> head = takeInput();
            int pos = scan.nextInt();
            int ele = scan.nextInt();
        
            head = PrintLL(head , pos , ele);  // fix: capture the returned head
            Print(head);
        }
    }        