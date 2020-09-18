import java.util.*;

public class YearMonthDay{
    public static void main(String[] args) {
        // int n;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = n.nextInt();
        
        int year = num/365;
         
        num = num%365;

        System.out.println("Year is :"+year);

        int week = num/7;

        num = num%7;

        System.out.println("Year is :"+week);

        int day = num;

        System.out.println("Year is :"+day);

    }
}