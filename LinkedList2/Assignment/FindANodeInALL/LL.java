package LinkedList2.Assignment.FindANodeInALL;

import java.util.Scanner;

public class LL {

    // Step 1: Take input from user and create linked list until -1 is entered
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        // Keep adding new nodes until user enters -1
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                // First node becomes both head and tail
                head = newNode;
                tail = newNode;
            } else {
                // Add new node to the end and update tail
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head; // Return the head of the created linked list
    }

    public static int findNodeRec(Node<Integer> head, int n)
    //  3 4 
     // 3
      {
        
        if(head == null) {
            return -1;
        }
         // 
        if(head.data == n) {
            return 0;
        }
       
        
        int result = findNodeRec(head.next, n);
        if(result == -1) {
            return -1;
        }else{
           return result+1;
        }
        
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Node<Integer> head = takeInput();
        int n = scan.nextInt();
        System.out.println(findNodeRec(head, n));
    }
}
