import java.util.*;

public class RadiusCircle{
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        // int r =10;

        double Area = 3.14*r*r;

        System.out.println("Area of Circle is:"+" "+Area);

        double Circum = 3.14*2*(2*r) ;
      
        System.out.println("Area of circumference  is:"+" "+Circum);


    }
}