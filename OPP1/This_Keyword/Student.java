package OPP1.This_Keyword;

public class Student {
    
    String Name;
    private int RollNumber;

    public Student(String Name , int RollNumber) {
        // this stores the reference of the data type
    //data member = local variable
        this.Name = Name;
        this.RollNumber = RollNumber;
    }

    public void Result() {

        System.out.println(Name + " : " + RollNumber);
    }
}
