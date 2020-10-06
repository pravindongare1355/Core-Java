class myclass{

    private int roll_no;
    private String name;

     void set(int roll_no ,String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
     void show()
    {
        System.out.println(roll_no+" "+name);
    }

}

public class ThisKeyword{

    public static void main(String[] args) {
        myclass e = new myclass();
        e.set(5,"Pravin");
        e.show();
    }
}