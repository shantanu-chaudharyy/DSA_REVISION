package LinkedList2.CollectionFrameWorkLL.Basics;

import java.util.LinkedList;

public class LL {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1.element());
        System.out.println(list1.get(0));
        
    }
}
