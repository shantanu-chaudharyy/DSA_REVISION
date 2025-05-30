package LinkedList2.LectureQuestion.MidpointOfLL;

import java.util.Scanner;

public class LL {

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

     public static Node<Integer> midPoint(Node<Integer> head) {
     
        if(head == null && head.next == null) {

           return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

        public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> result =  midPoint(head);
        System.out.println(result.data);
    }
}
