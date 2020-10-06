class myclass{
    // private int i;
    // private int j;
    // private int k;
    double k=0;

    static void multi(int i,int j)
    {
        // this.i = i;
        // this.j = j;

        double k = i * j;
        System.out.println("Multiplication of Two Numbers is:"+k);
    }
    static void multi(float i,float j,float l)
    {
        // this.i = i;
        // this.j = j;
        // this.l = l;

      double  k = i * j * l;

        System.out.println("Multiplication of Three Numbers is:"+k);


    }
    static void multi(double i,int j)
    {
        // this.i = i;
        // this.j = j;

      double  k = i * j;
        System.out.println("Multiplication of Two Numbers is:"+k);
    }
}
public class MethodOverloading{
    public static void main(String[] args) {
        myclass e = new myclass();
        e.multi(12,12);
        e.multi(12,12);
        e.multi(12,12);
    }
}