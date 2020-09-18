import java.util.*;

public class FtoC{

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);

        float f = c.nextFloat();

        float fer = f-32;
        
        float Cel= (5*fer/9) ;

        System.out.println("Fahrenheit to Celsius :"+Cel);
    }
}