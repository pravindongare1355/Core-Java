class Person
{
    String name;
    int age;
    
    Person()
    {
        String name = "xyz";
        int age = 18;
        System.out.println("Person Name and Age is :"+name+" "+age);

    }
   void Show (String name,int age )
    {
        this.name = name;
        this.age = age;
        System.out.println("Person Name and Age is :"+name+" "+age);
    }

    // void Show()
    // {
    //     System.out.println("Person")
    // }
}
public class DefaultConstructor{
    public static void main(String[] args) {
        Person p = new Person();
        // p.Show("Sheth",24); 
    }
}