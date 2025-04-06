package LinkedList1.InsertInLL;

import java.util.Scanner;

public class LL {
        
        public static Node<Integer> TakeInput() {
    
            Scanner s = new Scanner(System.in);
            int data = s.nextInt();
            
            Node<Integer> head = null, tail = null;
    
            while(data!=-1) {
    
                Node<Integer> NewNode = new Node<Integer>(data);
                if(head == null) {
                    head = NewNode;
                    tail = NewNode;
                }else {
    
                    tail.next = NewNode;
                    tail = NewNode;
                }
                data = s.nextInt();
            }
            return head;
    
        }
    
        public static void print(Node<Integer> head){
            
            while(head != null){
                System.out.print(head.data +" ");
                head = head.next;
            }
            System.out.println();
    
        }
    
        public static Node<Integer> Insert(Node<Integer> head , int data, int pos) {

            Node<Integer> ToAdd = new Node<>(data);
        
            if (pos == 0) {
                ToAdd.next = head;
                head = ToAdd;
                return head;
            }
        
            Node<Integer> Previous = head;
            for (int i = 0; i < pos - 1; i++) {
                if (Previous == null) return head; // position is out of bounds
                Previous = Previous.next;
            }
        
            ToAdd.next = Previous.next;
            Previous.next = ToAdd;
        
            return head;
        }
    
        public static void main(String[] args) {
            
            Scanner s = new Scanner(System.in);
    
    
            Node<Integer> head = TakeInput();
           
            int pos = s.nextInt();
            int data = s.nextInt();

           head = Insert(head , data,pos);
            print(head);
        }
    }