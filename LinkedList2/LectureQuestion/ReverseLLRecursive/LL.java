package LinkedList2.LectureQuestion.ReverseLLRecursive;

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

        public static Node<Integer> PrintLL(Node<Integer> head) {

            if(head == null || head.next == null) {
                return head;
            }
            Node<Integer> NewNode = PrintLL(head.next);
            
            Node<Integer> headNext = head.next;
            headNext.next = head;
            head.next = null;

            return NewNode;
        }
        public static void main(String[] args) {
            
            Node<Integer> head = takeInput();
            head = PrintLL(head);

            while(head != null) {

                System.out.print(head.data + " ");
                head = head.next;
            }

        }
}
