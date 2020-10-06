import java.util.*;
class myclass{
    private int a;
    private int b;
    private double c;

    void add(int a,int b)
    {
        this.a = a;
        this.b = b;
        c = a + b;
        System.out.println("Addition Of Two Numbers is:"+c);

    }
    void sub(int a, int b)
    {
        this.a = a;
        this.b = b;
        c = a - b;
        System.out.println("subtraction Of Two Numbers is:"+c);
    }
    void multi(int a, int b)
    {
        this.a = a;
        this.b = b;
        c = a * b;
        System.out.println("Multiplication Of Two Numbers is:"+c);
    }
    void div(int a, int b)
    {
        this.a = a;
        this.b = b;
        c = a / b;
        System.out.println("Division Of Two Numbers is:"+c);
    }
   
    
}
public class Calculator{
    public static void main(String[] args) {
        myclass e = new myclass();
        Scanner sc = new Scanner(System.in);
        
        // e.add(n,m);
        // e.sub(n,m);
        // e.multi(n,m);
        // e.div(n,m);
        System.out.println("1.Add 2.Sub 3.Multi 4.Div 5.Power");
        int ch = sc.nextInt();
        System.out.println("Enter a two numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        switch (ch) {
            case 1: e.add(n,m);
                
                break;
            case 2: e.sub(n,m);
                
                break;
            case 3: e.multi(n,m);
                
                break;
            case 4: e.div(n,m);
                
                break;
            case 5: e.power(n,m);
                
                break;
            default:
                break;
        }
       

    }
}