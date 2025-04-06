package OPP1.Static_Keyword;

public class Student {
    String Name;
    private int RollNumber;
    static int NumStudent; // which remain same for all like s1 se pucho ya s2 se number of student same hoga

    public static int GetNumStudent() {

    return NumStudent;
}

    public Student(String Name , int RollNumber) {

        this.Name = Name;
        this.RollNumber = RollNumber;
        NumStudent++;
    }

    public void Result() {

        System.out.println(Name +" : " + RollNumber);
    }
}
