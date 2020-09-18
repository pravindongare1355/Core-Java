import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        Scanner yr=new Scanner(System.in);
        // Scanner ir=new Scanner(System.in);

        System.out.println("Enter a year");
        int num=yr.nextInt();
        // int sum=ir.nextInt();


        if(num % 4 == 0)
        {
            System.out.println("given year is leap year");
        }
        else
        {
            System.out.println("given year is not leap year");

        }


    }
}