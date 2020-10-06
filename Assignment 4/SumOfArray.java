import java.util.*;
public class SumOfArray{
    public static void main(String[] args) {
        int arr[] = {
            4,6,7,4,3,7,3,9
        };
        int sum=0;
        int avg=0;
        // int a = arr.length();
        // for(int i=0;i<7;i++)
        // {
        //     // int a = arr.charAt(i);
        //     sum = sum+arr.charAt(i);;
        // }
        for(int a:arr)
        {
            sum = sum + a;
            

        }
        System.out.println("Sum is:"+sum);
        avg = sum/7;
        System.out.println("Average is:"+avg);


    }
}