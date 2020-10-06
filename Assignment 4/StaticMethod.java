 class Calculator{
    static int a;
    static int b;
    static int c;

    static int add(int a,int b)
    {
        
        return a+b;
        // System.out.println("Sum of Two Numbers:"+c);
    }
    static int sub(int a,int b)
    {
        return a-b;
    }

    static int mult(int a,int b)
    {
        return a*b;
    }
    static float div(int a,int b)
    {
        return a/b;
    }
    static int pow(int a,int b)
    {
        return a^b;
    }
}
public class StaticMethod{
    public static void main(String[] args)
    {
      int ans = Calculator.add(3,5);
      System.out.println("Sum Of Two Numbers:"+ans);

      int ans1 = Calculator.sub(3,5);
      System.out.println("Sub Of Two Numbers:"+ans1);

      int ans2 = Calculator.mult(3,5);
      System.out.println("Multi Of Two Numbers:"+ans2);

      float ans3 = Calculator.div(9,5);
      System.out.println("Div Of Two Numbers:"+ans3);

      int ans4 = Calculator.pow(3,5);
      System.out.println("Power Of Two Numbers:"+ans4);
    } 

}