package OPP1.Temp;

import OPP1.Classes_and_Object.Student;




public class StudentUse2  {

    public static void main(String[] args) {
        
    
    Student s4 = new Student();

    s4.Name = "harry";
    s4.SetRollNumber(12);

    System.out.println(s4.Name);
    System.out.println(s4.GetRollNumber());

}

}