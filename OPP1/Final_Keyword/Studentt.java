package OPP1.Final_Keyword;

public class Studentt {
    
    String name;

    // final keyword can be initialised once in class or constructor (i.e if we set 10 as rollnumber then it cant be changed again)
    private final  int rollnumber;

    public Studentt(String n) {
        rollnumber = 190;
        name = n;
    }

    public void print() {

        System.out.println(name + " : " + rollnumber);
    }
}
