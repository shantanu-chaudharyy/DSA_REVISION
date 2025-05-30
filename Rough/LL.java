package Rough;

import java.util.LinkedList;
import java.util.Scanner;

  public class LL {

    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      LinkedList List = new LinkedList<>();

      List.add(1);
      List.add(2);
      List.add(3);
      List.add(4);
      List.add(5);
      List.add(6);

      int i = 0;
      for(i = 0; i<List.size(); i++) {

        if(List.get(i).equals(n)) {

          System.out.println(i);
          return;
        }

      }
      System.out.println(-1);
    }
      
      }        