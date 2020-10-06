class Person
{
    void GetDetails()
    {
        System.out.println("Details !!");

    }
    void GetJob()
    {
        System.out.println("Job !!");

    }
}
class Employee extends Person
{
    void GetEmployeeDetails()
    {
        System.out.println("Employee Details !!");
   
    }
    void GetJob()
    {
        System.out.println("Job !!");

    }
}
public class InstanceMethods
{
    public static void main(String[] args) {
        
        Person p = new Employee();
        Employee e1 = (Employee)p;
        // Person arr[];
        e1.GetEmployeeDetails();
        Person arr[] =  {new Employee() , new Person()};
        for(Person i : arr){
            if(i instanceof Employee){
                Employee e = (Employee)i;
                e.GetEmployeeDetails();
    }
}
    }
         }