public class SquareSeries{
    public static void main(String arg[]){

        int n =3;
        int sum =12;
        int a=0;
        for (int i=1; i<=3 ; i++){

            System.out.println(sum);
            a = a+sum;
            sum = sum+10;

        }
        System.out.println("Sum of the series is : " +a);

    }
}