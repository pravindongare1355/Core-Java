import java.util.*;

public class SmallestGreater{
    public static void main(String[] args) {
        // int arr[] = new int[]{1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int num= sc.nextInt();
        int arr[]=new int[num];
        for(int i = 0; i<num; i++)
        {
            arr[i]=sc.nextInt();

        }

  
        int sm=arr[0]; 
        int lg=arr[0]; // mhnje base value arrychi that's = 1 ani ya sobat baki value compare karaychya

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>lg)  //arr[0]=2 and lg=1 i.e 2>1=true ..then loop will execute and store value in lg
            {              
               lg=arr[i];
            }
            if(arr[i]<sm)
            {
               sm=arr[i];
            }
        }

        System.out.println("Smallest No is:"+sm);
        System.out.println("Largest No is:"+lg);
     
    }
}