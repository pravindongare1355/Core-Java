/*47.Create a program to demonstrate constructor chaining.*/

import java.util.*;
class Person
{
  private int age;
  private String name;
 Person()
 {
   this(108, "Tejaswini S");
 }
 Person(int age, String name) 
 {
   this.age = age;
   this.name = name;
 }
 void showRecord() 
{
  System.out.println("Age : "+age);
  System.out.println("Name : "+name);
 }
}

class Emp extends Person{
	
	private String dept;
	
	Emp() {
		
		this(115, "Yamini P", "Aurangabad");
	}
	
	Emp(int age, String name, String dept) {
		
		super(age, name);
		this.dept = dept;
	}
	
 void showRecord()
  {
   super.showRecord();
   System.out.println("dept : "+dept);
  }
}

public class ConstructorChaining
{
 public static void main(String args[]) 
 {
  Person arr[] = {new Person(), new Emp()};
  for(Person trav : arr)
  {
   trav.showRecord();
   }
 }
}

