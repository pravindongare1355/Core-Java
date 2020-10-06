public class Vowels
{
    public static void main(String[] args) {
        String s = "PravinSheth";
        int count = 0;
        for(int i=0; i<s.lenght();i++)
        {
            char ch = s.charAt(i);
            if(ch==a || ch==e || ch==i || ch==o || ch==u)
            {
                ++count;
            }
        }
        System.out.println("Vowels Count is:"+count);
    }
}