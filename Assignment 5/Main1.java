/*43.Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some 
values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show() 
 to print OneBHK’s instance variable values.Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area.
 Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. */




import java.util.*;
class Faculty
{
    int facultyId ;
    int salary ;
    
    void input(int facultyId)
	{
        this.facultyId = facultyId;
    }
    void printSalary()
	{
        System.out.println("Salary is : "+salary);
    }
} 
class FullTimeFaculty extends Faculty
{
    int basicSalary;
    int allowance;

    void input(int facultyId ,int basicSalary , int allowance)
	{
        super.input(facultyId);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.salary = basicSalary + allowance;
    }

}
class PartTimeFaculty extends Faculty
{
    int workingHours;
    int ratePerHour;
    void input(int facultyId , int workingHours , int ratePerHour)
	{
        super.input(facultyId);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
        this.salary = workingHours * ratePerHour;
    }
}

class Main1
{
    public static void main(String[] args)
	{
        FullTimeFaculty ftf = new FullTimeFaculty();
        ftf.input(1,10000,2000);
        ftf.printSalary();

        PartTimeFaculty ptf = new PartTimeFaculty();
        ptf.input(2,100,100);
        ptf.printSalary();

    }
}