class Overloading{
    int a;
    int b;
    
    float f1;
    float f2;
    float f3;
 
    int multi = 1;


    double c;

    void Multiply(int a,int b)
    {
        this.a = a;
        this.b = b;
 
        int ans = a*b;
        System.out.println("Multiplication Of two integers is:"+ans);
    }

    void Multiply(float f1,float f2,float f3 )
    {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        float ans = f1*f2*f3;
        System.out.println("Multiplication Of three float is:"+ans);
    }

    void Multiply(double c,int b)
    {
        this.c = c;
        this.b = b;
 
        double ans = a*b;
        System.out.println("Multiplication Of two Double is:"+ans);
    }

    void Multiply()
    {
        int arr[] ={
            1,4,6,4,32,7
        };

        for(int i=0; i<arr.length; i++)
        {
            multi = multi*arr[i];
        }
        System.out.println("Array Multiplication is:"+multi);
    }
    }

public class OverloadMethods{
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.Multiply(4,4);
        o.Multiply(2,3,5);
        o.Multiply(22.33,5);
        o.Multiply();
    }
}