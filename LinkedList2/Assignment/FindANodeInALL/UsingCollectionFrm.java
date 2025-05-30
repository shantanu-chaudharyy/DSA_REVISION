package LinkedList2.Assignment.FindANodeInALL;

import java.util.LinkedList;
import java.util.Scanner;

public class UsingCollectionFrm {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList List = new LinkedList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);

        int i = 0;
        for( i = 0; i<List.size(); i++) {

            if(List.get(i).equals(n)) {

                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
