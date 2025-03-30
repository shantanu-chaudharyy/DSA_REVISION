package OPP1.Getter_And_Setter;

public class StudentUse1 {
    
    public static void main(String[] args) {
        
        Student1 s1 = new Student1();

        s1.name = "shantanu";
        s1.SetRoll(12);

        System.out.println(s1.name);
        System.out.println(s1.GetRoll());
    }
}
