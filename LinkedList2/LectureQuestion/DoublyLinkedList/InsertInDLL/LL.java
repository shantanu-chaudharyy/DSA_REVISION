package LinkedList2.LectureQuestion.DoublyLinkedList.InsertInDLL;

    import java.util.Scanner;

    public class LL {
    
        
        public static Node<Integer> takeInput() {
                Scanner s = new Scanner(System.in);
                int data = s.nextInt();
        
                Node<Integer> head = null;
        
                while (data != -1) {
                    Node<Integer> newNode = new Node<Integer>(data);
                    if (head == null) {
                        head = newNode;
                        newNode.next = newNode;
                        newNode.prev = newNode;
                    } else {
                        Node<Integer> tail = head.prev;
                        tail.next = newNode;
                        newNode.prev = tail;
                        newNode.next = head;
                        head.prev = newNode;
                    }
                    data = s.nextInt();
                }
                return head;
            }
    
            public static Node<Integer> Insert(Node<Integer> head , int pos , int val) {
                
                if(head == null || head.next == null) {
                    return head;
                }
                if(pos == 1) {

                    Node<Integer> NewNode = new Node<>(val);
                    NewNode.next = head;
                    head.prev = NewNode;
                    head = Newnode;
                    return NewNode;
                }

                head.next = Insert(head.next, pos-1, val);
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
                int val = scan.nextInt();

                
                Print(Insert(head, pos, val));
            }
        }
    
       
    
       
