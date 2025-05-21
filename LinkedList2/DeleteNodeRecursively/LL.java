package LinkedList2.DeleteNodeRecursively;

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

        public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
            // Base case: if head is null, return null
            if (head == null) {
                return null;
            }
    
            // If position is 0, remove the current node
            if (pos == 0) {
                return head.next;
            }
    
            // Recursive call on the next node
            head.next = deleteNodeRec(head.next, pos - 1);
    
            return head;
        } 
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Node<Integer> head = takeInput();
            int pos = scan.nextInt();
    
            // Update head with the result of deleteNodeRec
            head = deleteNodeRec(head, pos);
    
            // Print the linked list
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }