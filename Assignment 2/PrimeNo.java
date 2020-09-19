import java.util.*;

public class PrimeNo{
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number");

         int num = sc.nextInt();

         int temp = 0;

         for( int i = 2 ; i<=num-1; i++)     //num-1 , eg. 67-1 =66// eg. 66 -1=65
         {
             if(num%i==0)                    //67//66
             {
                 temp = temp +  1;
             }

         }
         if(temp>0)
         {
             System.out.println("Not Prime");
         }
         else
         {
            System.out.println("Prime");
 
         }

         

        }

    }
