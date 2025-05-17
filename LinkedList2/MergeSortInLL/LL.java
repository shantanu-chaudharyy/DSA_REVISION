    package LinkedList2.MergeSortInLL;

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

        // Step 2: Find middle node using slow and fast pointers
        public static Node<Integer> FindMid(Node<Integer> head) {
            Node<Integer> slow = head;
            Node<Integer> fast = head;

            // Move slow by 1 and fast by 2 until fast reaches the end
            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // slow is now at the middle
        }

        // Step 3: Merge two sorted linked lists
        public static Node<Integer> merge(Node<Integer> left , Node<Integer> right) {
            // Base case checks
            if(left == null) {
                return right;
            }
            if(right == null) {
                return left;
            }

            // Create dummy node to start the merged list
            Node<Integer> ans = new Node<Integer>(-1);
            Node<Integer> tail = ans;

            // Traverse both lists and merge by comparing data
            while(left != null && right != null) {
                if(left.data <= right.data) {
                    tail.next = left;
                    tail = left;
                    left = left.next;
                } else {
                    tail.next = right;
                    tail = right;
                    right = right.next;
                }
            }

            // Attach remaining nodes of either list (if any)
            while(left != null) {
                tail.next = left;
                tail = left;
                left = left.next;
            }
            while(right != null) {
                tail.next = right;
                tail = right;
                right = right.next;
            }

            ans = ans.next; // skip dummy node
            return ans;
        }

        // Step 4: Recursive Merge Sort for Linked List
        public static Node<Integer> MergeSort(Node<Integer> head){
            // Base case: if list is empty or has only 1 node
            if(head == null || head.next == null) {
                return head;
            } 

            // Break list in two halves after finding mid
            Node<Integer> mid = FindMid(head);
            Node<Integer> left = head;
            Node<Integer> right = mid.next;
            mid.next = null; // break the list

            // Recursive calls to sort both halves
            left = MergeSort(left);
            right = MergeSort(right);

            // Merge sorted halves and return
            Node<Integer> result = merge(left , right);
            return result;
        } 
        // Utility function to print the list
        public static void printList(Node<Integer> head) {
            while(head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Node<Integer> head = takeInput();      // Create list from user input
            head = MergeSort(head);                // Sort the list using merge sort
            printList(head);                       // Print sorted list
        }

    
    }
