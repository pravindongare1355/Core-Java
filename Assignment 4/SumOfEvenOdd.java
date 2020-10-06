import java.util.*;
public class SumOfEvenOdd{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+" "+n+" "+"Elements:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
         int sum=0;
         int sum1=0;
        for(int i=0; i<n; ++i)
        {
            // System.out.println("Array Elements Are:"+arr[i]);
      
            if(arr[i]%2==0)
            {
                // System.out.println("Even Elements Are:"+arr[i]);
                sum = sum+arr[i];
            }
            else
            {
                // System.out.println("Odd Elements Are:"+arr[i]);
                sum1 = sum+arr[i];
            }
          
        }
        System.out.println("Sum of Even Elements is:"+sum);
        System.out.println("Sum of Odd Elements is:"+sum1);


        
    }
}