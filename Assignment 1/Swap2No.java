import java.util.*;

public class Swap2No{

    public static void main(String[] args) {

        int x = 10;
        int y = 60;
System.out.println("Before Swap:"+x+ " " +y);
        x = x*y; // x=600
        y = x/y; // y=10
        x = x/y; // x=60

System.out.println("After Swap:"+x+ " " +y);

    }
}