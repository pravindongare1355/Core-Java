import java.util.*;
public class DiagonalSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int sum = 0;
        for (int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print("Enter the number "+i+" , "+j+" : ");
                arr[i][j] = sc.nextInt();
                if( i == j )
                    sum = sum+arr[i][j];
            }
        }
    
        System.out.println("Sum of Diagonal Element is : "+sum);


    }
}