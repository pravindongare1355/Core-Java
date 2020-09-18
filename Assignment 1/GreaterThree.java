import java.util.Scanner;

public class GreaterThree{

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        Scanner c=new Scanner(System.in);

        System.out.println("Enter a three numbers");

        int a1=a.nextInt();
        int b1=b.nextInt();
        int c1=c.nextInt();

        if(a1 > b1 && a1 > c1)
        {
            System.out.println("A1 is Greatest Number");
        }
        else if(b1 > c1)
        {
            System.out.println("B1 is Greatest Number");
   
        }
        else
        {
            System.out.println("c1 is Greatest Number");

        }
    }
}