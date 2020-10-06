class myclass{
    private int empId;
    private String name;

    myclass(int empId)
    { 
         this(101,"Pravin");
        this.empId = empId;
        System.out.println("Single Argument"+" "+empId);
    }
    myclass(int empId,String name)
    {
        this.empId = empId;
        this.name = name;

        System.out.println("Double Argument"+" "+empId+" "+name);
    }
}
public class ThisFunctionality{
    public static void main(String[] args) {
        myclass e = new myclass(56);
    }
}