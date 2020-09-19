import java.util.*;
public class SumOddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum1=0;
        int sum2=0;
        System.out.println("enter an elements array ");

        for(int i = 0; i<num; i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i<num; i++)
        {
            if(arr[i]%2==0)
            {
                sum1 = sum1 + arr[i]; 
            }
            else
            {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println("sum of even:" +sum1);
        System.out.println("sum of odd:" +sum2);



    }
}