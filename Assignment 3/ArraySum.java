import java.util.*;
public class ArraySum{
	public static void main(String args[]){
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
        int c[] = {4,3,2,1};
        int d[] = {8,7,6,5};
        int e[] = {9};
    
		int arr[][] = new int[5][];
		arr[0] = a;
		arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;
		for(int ar[] : arr){
			for(int k : ar){
				System.out.print("  "+k);
			}
			System.out.println("");
		}
		int sum = 0;
		for(int i=0;i<5;i++)
		{ 
			for (int j=0; j<arr[i].length;j++){ 
			sum = sum + arr[i][j];
			}
		}
		System.out.println("Sum of Array is :"+" "+sum);
        
	}
}