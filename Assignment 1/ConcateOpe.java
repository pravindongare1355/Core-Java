import java.util.*;

public class ConcateOpe{

    public static void main(String[] args) {
        Scanner sub1=new Scanner(System.in);
        Scanner sub2=new Scanner(System.in);
        Scanner sub3=new Scanner(System.in);
        Scanner sub4=new Scanner(System.in);
        Scanner sub5=new Scanner(System.in);

        System.out.println("Enter Your Five Subject's Marks");

        int Marathi   = sub1.nextInt();
        int Hindi     = sub2.nextInt();
        int History   = sub3.nextInt();
        int Geography = sub4.nextInt();
        int Economics = sub5.nextInt();

        float sum = (Marathi+Hindi+History+Geography+Economics);

        float per = (sum/500)*100 ;

        System.out.println("Percentages Marks:"+" "+per);
    }
}