import java.util.*;
public class IndexArray{
    public static void main(String[] args) {
        int arr[] = 
    { 
        12,34,56,77,43,77,58
    };
    Scanner sc = new Scanner(System.in);
    int e = sc.nextInt();
for(int a : arr)
{
    if(e == a)
    {
        System.out.println("Element is found !!"+findIndex(arr,a));
    }
}
    

    
  }
}