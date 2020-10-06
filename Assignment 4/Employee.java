class Employee1
{
    String ename;
    int empid;
    float salary;

    Employee1(String ename, int empid,float salary)
    {
        this.ename = ename;
        this.empid = empid;
        this.salary = salary;

    }
    void show()
    {
        System.out.println("Employee Details:");
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee Employee Id:"+empid);
        System.out.println("Employee Salary:"+salary);

    }

    public String toString(){

         return ename+" "+empid+" "+salary; 
    }
}
public class Employee{
    public static void main(String[] args) {
        Employee1 s = new Employee1("Akash",01,24525);
        Employee1 s1 = new Employee1("Pravin",02,89234);
        Employee1 s2 = new Employee1("Akshay",03,87332);
        Employee1 s3 = new Employee1("Dipak",04,83893);
        Employee1 s4 = new Employee1("Sachin",05,98389);
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);


        // s.set("Akash",01,24525);
        // s1.set("Pravin",02,89234);
        // s2.set("Akshay",03,87332);
        // s3.set("Dipak",04,83893);
        // s4.set("Sachin",05,98389);
        // s.show();
        // s1.show();
        // s2.show();
        // s3.show();
        // s4.show();

            

    }
}