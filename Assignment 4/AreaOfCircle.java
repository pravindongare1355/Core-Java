import java.util.*;
class myclass{
    private int radius;
    private double area;

    void AreaCal(int radius)
    {
        area = 3.14*radius*radius;

    }

    void set(int radius)
    {
        this.radius = radius;
    }
    void Display()
    {  
       System.out.println("Radius Of Circle:"+radius);
       System.out.println("Area Of Circle:"+area);
    }
}
public class AreaOfCircle{
    public static void main(String[] args) {
        myclass e = new myclass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius of circle");
        int n = sc.nextInt();
        e.set(n);
        e.AreaCal(n);
        e.Display();
    }
}