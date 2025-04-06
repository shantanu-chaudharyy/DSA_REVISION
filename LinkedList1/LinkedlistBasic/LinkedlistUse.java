package LinkedList1.LinkedlistBasic;

public class LinkedlistUse {
    
    public static void main(String[] args) {
        
        Node<Integer> Node1 = new Node<Integer>(10);
        Node<Integer> Node2 = new Node<Integer>(20);
        Node<Integer> Node3 = new Node<Integer>(30);
 
        Node1.next = Node2;
        Node2.next = Node3;

        Node<Integer> Head = Node1; // @Node1_Referrence , @Node2_Referrence

        while(Head!=null) {

            System.out.print(Head.data + " "); //Node1_data

            Head = Head.next; //Node1.next = Node2
        }
//1,2,3,4,
// 1 index
       
    }
}
