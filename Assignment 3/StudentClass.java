import java.util.*;
class myclass{
    private int RollNo;
    private String name;

    void set(int x,String y )
    {
        RollNo = x;
        name = y;
    }
    void show()
    {
        System.out.println(RollNo+" "+name);
    }
    
    
}

public class StudentClass{

    public static void main(String[] args) {
        myclass e = new myclass();
        e.set(100,"Sheth");
        e.show();
    }
}