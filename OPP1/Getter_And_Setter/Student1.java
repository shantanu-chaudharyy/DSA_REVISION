package OPP1.Getter_And_Setter;

public class Student1 {
    
   public String name;
   private  int Roll;


public void SetRoll(int rn) {

    if(rn<=0) { // rn should be less then 0 so that no one can set roll to negative number.
        return;
    }
    Roll = rn;
}

public int GetRoll() {

    return Roll;
}

}