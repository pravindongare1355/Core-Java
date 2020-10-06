import java.util.*;
class Employee{
    private int empNo;
     int salary;
    private int totalSal;

    Employee(int salary)
    { 

        empNo++;
        this.salary = salary;
        this.totalSal = totalSal+salary;


    }
    void Display()
    {
        System.out.println("Total Employee is:"+empNo);
        System.out.println("Total Salary is:"+totalSal);

    }

}
public class PrameterizedCon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Employee e = new Employee(c);
        e.Display();
    }
}