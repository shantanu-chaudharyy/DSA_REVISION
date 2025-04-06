package LinkedList1.ArrayList;

import java.util.ArrayList;

public class Linkedlistb {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> List1 = new ArrayList<>();

        System.out.println(List1.size()); // to get the size of arraylist
        // to add and number in arraylist we use list1.add(element)
        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);
        List1.add(50);

        // for loop - traverse on index (i.e - 1,2,3,4,5 ... for loop will work on index 0,1,2,3,4)
        // for each loop - traverse directly on element (i.e - 1,2,3,4,5 .. for each will work on directly element 1,2,3,4,5)
        for(int elem : List1) {

            System.out.print(elem + " ");
        }
}
}