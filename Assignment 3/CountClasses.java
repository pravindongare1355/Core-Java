class Student{
    private int rno;
    private String name;
    private static int count;
    void setData(int rno , String name){
        this.rno = rno;
        this.name = name;
        count++;
    }
    void showData(){
        System.out.println("Roll No. : "+rno+"\nName : "+name);
    }
    void countStudent(){
        System.out.println("Count of Student is : "+count);
    }
}
class CountClasses{
    public static void main(String[] args){
        Student s = new Student();
        s.setData(1,"Pravin");
        s.showData();

        Student s1 = new Student();
        s1.setData(2,"Dongare");
        s1.showData();

        s1.countStudent();
            
        


    }
}