package LinkedList1.ArrayList;

import java.util.ArrayList;


public class BasicArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> List1 = new ArrayList<>();

        System.out.println(List1.size()); // to get the size of arraylist
        // to add and number in arraylist we use list1.add(element)
        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);
        List1.add(50);
      
        // for get any number we use List1.get(index)
        System.out.println("for get any number we use List1.get(index)");
        for(int i = 0; i<List1.size(); i++) {

            System.out.print(List1.get(i) + " ");
        }
        System.out.println();

        // for add any new number anywhere we use list1.add(index,element)
        System.out.println("for add any new number anywhere we use list1.add(index,element)");
        List1.add(2, 5);

        for(int i = 0; i<List1.size(); i++) {

            System.out.print(List1.get(i) + " ");
        }
        System.out.println();
        // for remove any data we use list1.remove(index)
    System.out.println("for remove any data we use list1.remove(index)");
        List1.remove(2);

        for(int i = 0; i<List1.size(); i++) {

            System.out.print(List1.get(i) + " ");
        }
        System.out.println();

        // to set any number which mean we have 1,2,3,4,5 and we set number 9 at index 1 then 
        // we will get 1,9,3,4,5.... it means we just override the value 9 on 2
        System.out.println("for set any Number of perticuler index we use list1.set(index,element)");

        List1.set(2, 9);

        for(int i = 0; i<List1.size(); i++) {

            System.out.print(List1.get(i) + " ");
        }
    }
}
