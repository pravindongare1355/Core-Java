import java.util.*;

public class ReverseNumber{

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("enter a number");
        // int num = 1234;

        int num = a.nextInt();

        int rev = 0;

        while(num != 0)
        {
           rev = rev*10 + num%10;
            num = num/10; 
            //   num=num%10;

        }
        System.out.println(rev);

    }
}