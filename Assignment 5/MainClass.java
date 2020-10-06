/*48.Create an Abstract class Processor with int member variable data  and method showData to display data value. 
Create abstract method process() to define processing of member data. Create a class  Factorial using abstract 
class Processor  to calculate and print factorial of a number by overriding the process method. b. Create a class 
Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.Ask 
user to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve 
this mechanism.*/


import java.util.Scanner;
abstract class Processor
{

   int data;

    abstract void process();
    
     abstract void showData();

}

class Factorial extends Processor
{
     int fact = 1;
     int no;
  void process(){
    System.out.println("enetr num for factorial :");
   Scanner s = new Scanner(System.in);
     int no = s.nextInt();
        this.fact = fact;
    for(int i=1; i<=no; i++)
    {
         fact = fact * i;
    }
    
  }

  void showData()
  {
    System.out.println("factorial ="+fact);
  }

}

class Circle extends Processor{
    double pi = 3.14;
    int r;
    double area;

    void process(){
        System.out.println("enetr radius of circle :");
        Scanner s1 = new Scanner(System.in);
        int r = s1.nextInt();
        this.pi = pi;

        area = pi * r * r;
    }

    void showData(){

        System.out.println("area of circle =" + area);
    }
}

class MainClass
{

    public static void main(String args[]){

        Factorial f = new Factorial();
        f.process();
        f.showData();

        Circle c = new Circle();
        c.process();
        c.showData();
    }


}





