package OPP1.Classes_and_Object;

public class StudentUse {
     
    public static void main(String[] args) {
        
      Student s1 = new Student();

      s1.Name = "Akash";
      s1.Roll = 15;

      Student s2 = new Student();
      s2.Name = "Shantanu";
      s1.Roll = 12;

      System.out.println(s1.Name);
      System.out.println(s1.Roll);
    }
}
