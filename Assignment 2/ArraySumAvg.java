import java.util.*;

public class ArraySumAvg{

    public static void main(String[] args) {
        int num;
        int sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
         num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter array elments");
        for(int i = 0; i< num; i++)
        {
            arr[i] = sc.nextInt();
            // System.out.println(arr[i]);

            sum = sum + arr[i]; //0+1,1+2
        }
        for(int a:arr)
        {
            System.out.println("Here Array Elements:"+a);
        }

         System.out.println("Sum:"+sum);

         avg = sum/num;

         System.out.println("Avg of given numbers are:"+avg);
    }
}