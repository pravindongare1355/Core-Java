import java.util.*;

public class MandF{

    public static void main(String[] args) {
        
        Scanner c= new Scanner(System.in);
        System.out.println("Enter Your Gender M/F");
        String Gen = c.nextLine();
        System.out.println("Gender is:"+Gen);

        Scanner a= new Scanner(System.in);
        System.out.println("Enter Your Age");
        int Age = a.nextInt();
        System.out.println("Gender is:"+Age);


        if (Age > 21)
        {
            System.out.println("Eligible For Marriage");
        }
        else
        {
            System.out.println("Not Eligible For Marriage");

        }


    }
}