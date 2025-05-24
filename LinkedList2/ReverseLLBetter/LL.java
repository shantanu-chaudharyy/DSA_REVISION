package LinkedList2.ReverseLLBetter;

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

        public static DoubleNode ReverseLLBetter(Node<Integer> head) {
            if (head == null || head.next == null) {
                DoubleNode ans = new DoubleNode();
                ans.head = head;
                ans.tail = head;
                return ans; // you were missing this return
            }
        
            DoubleNode smallAns = ReverseLLBetter(head.next);
             // 1,2,3,4
                    // 4,3,2
                    // head = 4 , tail = 2
                    // tail.next -> head , 2 -> 1
                    // NewLL.head = null , 1 -> null 
        
            smallAns.tail.next = head; // link last element to current head
            head.next = null; // set the new tail’s next to null
        
            DoubleNode ans = new DoubleNode();
            ans.head = smallAns.head;
            ans.tail = head;
        
            return ans;
        }
        public static void main(String[] args) {
            Node<Integer> head = takeInput();
            DoubleNode reversed = ReverseLLBetter(head);
            head = reversed.head; // update head to the reversed head
        
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
        
}
                   