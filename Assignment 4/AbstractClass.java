import java.util.*;

abstract class Parent
{
    public double data;
    abstract void Process();

    
    void show(double data)
    {
        System.out.println("Abstract class Data:"+data);
    }
}
class Child extends Parent
{
    void Process()
    {
    double factorial = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Value");
    data = sc.nextDouble();

    for(double i=0;i<=data;i++)
    {
       factorial = factorial*i;
    }
    show(factorial);
}
}
class Child1 extends Parent
{
    void Process()
    {
        double CircleArea;
        double pie = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value");
        data = sc.nextDouble();
        CircleArea = 3.14*data*data;
       show(CircleArea);
    }
}
public class AbstractClass
{
    public static void main(String[] args) {
        Child c = new Child();
        // c.Process();
        Child1 c1 = new Child1();
        // c1.Process();
        Scanner e = new Scanner(System.in);
        System.out.println("Enter a choice: 1.Factorial 2.AreaOfCicle");
        int ch = e.nextInt();
        switch (ch) {
            case 1: c.Process();
                
                break;
        
            case 2 : c1.Process();

            break;
            default:
                break;
        }
    }
}