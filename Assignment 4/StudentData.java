class Student{
    public int roll_no;
    public String name;

    void Set (int roll_no,String name)
    {
        this.roll_no = roll_no;
        this.name = name;

        // Student();
    }
    // Student(int roll_no)
    // {
    //     this();
    //     this.roll_no = roll_no;
    // }

    void Show()
    {
        System.out.println("Student Roll No is:"+roll_no+" "+"Student Name is: " +" "+name);
    }
}
public class StudentData{
    public static void main(String[] args)
    {
        Student s = new Student();
        // Student s1 = new Student(12);

        s.Set(11,"Sheth");
        s.Show();
        
    }
}