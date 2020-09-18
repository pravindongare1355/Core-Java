import java.util.*;

public class GrossSal{

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int sal = b.nextInt();

        if(sal < 10000)
        { 
            double HRA = (sal*0.10) ;
            double DA = (sal*0.90);

            double GrossSalary = sal + DA + HRA ;

            System.out.println("Gross Salary is :"+ GrossSalary );


        }
        else 
        { 
            
            double HRA1 = 2000 ;
            double DA1 = 10000*0.98;

            double GrossSalary1 = sal + DA1 + HRA1 ;

            System.out.println("Gross Salary is :"+ GrossSalary1 );

           
        }
    }
}