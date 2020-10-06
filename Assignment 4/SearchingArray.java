import java.util.*;
public class SearchingArray{
    public static void main(String[] args) {
        int arr[] =
        {
            12,34,455,2344,234,8912

        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Element:");
        int a = sc.nextInt();

        for(int i:arr)
        {
            if(a==i)
            {
                System.out.println("Element Found !!!");
            }

        }
        

        




        
    }
}