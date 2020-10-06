class Faculty{
    public int empId;
    public int Sal;

    Faculty(int empId,int Sal)
    {
        this.empId = empId;
        this.Sal = Sal;

    }
    void show()
    {
        System.out.println("Employee Id is:"+empId+" "+"Employee"+" "+Sal);
    }
}
class FullTimeFaculty
{
    public int BasicSal;
    public int Allowance;
    public int TotalSal;

    FullTimeFaculty(int empId,int BasicSal,int Allowance)
    {
        super(empId);
        this.BasicSal = BasicSal;
        this.Allowance = Allowance;

        TotalSal = BasicSal+Allowance;

    }
    void show()
    {
        System.out.println("Basic Salary is:"+BasicSal);
        System.out.println("Basic Salary is:"+Allowance);
        System.out.println("Gross Salary is:"+TotalSal);

    }
}
class PartTimeFaculty extends Faculty
{
    public int WorkingHrs;
    public int RatePerHr;
    private int GrossSal;

    PartTimeFaculty(int empId, int WorkingHrs,int RatePerHr)
    {
      super(empId);
      this.WorkingHrs = WorkingHrs;
      this.RatePerHr = RatePerHr;

      GrossSal = WorkingHrs*RatePerHr;
    }
    void show()
    {
       System.out.println("Employee Working Hrs:"+WorkingHrs);
       System.out.println("Employee Rate Per Hrs:"+RatePerHr);
       System.out.println("Part Time Faculty Employee Gross Salary:"+GrossSal);


    }
} 

public class ThreeFaculty
{
    public static void main(String[] args) {
      
        FullTimeFaculty f = new FullTimeFaculty(01,8,50);
        PartTimeFaculty e = new PartTimeFaculty(02,8000,1000);
        
        f.show();
        e.show();


        
    }
}

