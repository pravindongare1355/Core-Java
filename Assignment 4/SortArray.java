import java.util.Arrays; 

public class SortArray{
    public static void main(String[] args) {
        int arr[] = {
            12,43,53,64,64,23
        };

        System.out.println("Original Array:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
    }
}