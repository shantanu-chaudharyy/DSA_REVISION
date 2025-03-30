package OPP1.Constructor;

public class Student2 {
    
    public String name;
    private int Roll;

    public Student2(String n , int rn) {

        name = n;
        Roll = rn;
    }

    public void result() {

        System.out.println(name + " : " + Roll);
    }
}

