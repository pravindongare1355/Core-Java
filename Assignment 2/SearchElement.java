import java.util.*;
public class SearchElement{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int i;
        System.out.println("enter a element that u have to find out");
        for( i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                System.out.println(" present :"+" "+key);
                break;
            }

        }
    
    if ( i == arr.length)
    {
        System.out.println(" not present array."+key);

    }
}
}