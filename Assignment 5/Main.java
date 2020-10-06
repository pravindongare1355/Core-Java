/*45.Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. 
Create method show() to display information. Create another class CollegeStudent inherits Student class. Add a new member semester to it.
 Create default and parameterized constructors. Also override show() method that calls super class show() method and displays semester.
 Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. Create default and 
 parameterized constructors. Also override show() method that calls super class show() method and displays className. Create a class( say Demo) 
 with main method that carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent)
 --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- search record 
 on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. */




import java.util.*;
class Student
{
    int rollno ;
    float percentage;

    Student(int rollno , float percentage)
	{
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show()
	{
        //Information
        System.out.println("\n\nRoll NO is : "+rollno);
        System.out.println("Percentage is : "+percentage);
    }
}
class CollegeStudent extends Student{
    int semester ;
    CollegeStudent(int rollno , float percentage ,int semester){
        super(rollno,percentage);
        this.semester = semester;

    }
    void show(){
        super.show();
        System.out.println("Semester is : "+semester);
    }
}
class SchoolStudent extends Student
{
    String className;
    SchoolStudent(int rollno , float percentage , String className)
	{
        super(rollno , percentage);
        this.className = className;
    }
    void show()
	{
        super.show();
        System.out.println("Class Name is : "+className);
    }
}

class Main{
    public static void main(String[] agrs)
	{
        CollegeStudent arrCollegeStudent[] = new CollegeStudent[2];
        SchoolStudent arrSchoolStudent[] = new SchoolStudent[3];

        int gradeCollegeStudent=0;
        int gradeSchoolStudent=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<arrCollegeStudent.length ; i++)
		{
            System.out.println("Enter the Roll Number of Collage Student : ");
            int rollno =  sc.nextInt();
            System.out.print("Enter the Percentage of Collage Student : ");
            float percentage =  sc.nextFloat();
            System.out.println("Enter the Semester of Collage Student : ");
            int semester =  sc.nextInt();
            CollegeStudent cs = new CollegeStudent(rollno , percentage , semester );
            arrCollegeStudent[i] = cs;

            if(percentage >= 75) gradeSchoolStudent++;

        }

        for(int j=0 ; j<arrSchoolStudent.length ; j++)
		{
            System.out.print("\n\nEnter the Roll Number of School Student : ");
            int rollno = sc.nextInt();
            System.out.print("Enter the Percentage of School Student : ");
            float percentage = sc.nextFloat();
            System.out.print("Enter the Class Name of School Student : ");
            String className = sc.next();
            SchoolStudent ss = new SchoolStudent(rollno , percentage , className);
            arrSchoolStudent[j] = ss;

            if(percentage >= 75) gradeSchoolStudent++;
        }
        for(CollegeStudent p : arrCollegeStudent) p.show();
        for(SchoolStudent q : arrSchoolStudent) q.show();

        System.out.print("Enter the Roll Number fo Seraching : ");
        int searchRollNo = sc.nextInt();
        byte flag = 1;
        for(int i=0 ; i < arrCollegeStudent.length ; i++)
		{
            if(searchRollNo == arrCollegeStudent[i].rollno)
			{
                System.out.println("Student is of College Student !!");
                flag = 0;
                break;
            }
            else{
                for(int j=0 ; j< arrSchoolStudent.length ; j++)
				{
                    if(searchRollNo == arrSchoolStudent[i].rollno)
					{
                        System.out.println("Student is of Scholl Student !!");
                        flag = 0;
                        break;
                    }
                   
                }
            }
        }
        if(flag == 1) System.out.println("Student Roll Number is Not Valid !!");
        int greadAStudent = gradeCollegeStudent+gradeSchoolStudent;
        System.out.println("Students are having A grade : "+greadAStudent);
    }
}