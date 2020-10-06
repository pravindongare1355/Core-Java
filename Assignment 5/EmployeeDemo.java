/*46.Create a program to demonstrate the use of instanceof operator or secure reference down casting.*/



import java.util.*;
class Person
{
	void getDetail()
	{
		System.out.println("person details");
	}
	void getJob()
	{
		System.out.println("person job");
	}
}
class Employee extends Person
{
	void getJob()
	{
		System.out.println("employee job");
	}
	void getDept()
	{
		System.out.println("employee dept");
	}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
		Person ar[] = {new Employee(),new Person()}; 
		for(Person a : ar)
		{
			if(a instanceof Employee)
			{
			  Employee e = (Employee)a;
			  e.getDept();
			}
		}
	}
}