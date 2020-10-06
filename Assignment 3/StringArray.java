import java.util.*;
public class StringArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a array size:");
        // int n = sc.nextInt();
        String arr[] = new String[4];
        for(int i=0; i<4;i++)
        {
            arr[i] = sc.nextLine();
        }
        for(String a : arr)
        {
            System.out.println("Array Elements Are:"+" "+a);
        }
    }
}