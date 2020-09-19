import java.util.*;

public class MathsTable{

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = a.nextInt();

        for(int i=1; i<=10; i++)
        {
            int sum = num*i;
            System.out.println(sum);
        }
    }
}