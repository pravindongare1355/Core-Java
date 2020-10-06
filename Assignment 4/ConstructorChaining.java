class Sheth
{ 
    public int PropertyPerc;
    public int Faalak;
    Sheth(int PropertyPerc,int Faalak)
    { 
        this(5);
        this.PropertyPerc = PropertyPerc;
        this.Faalak = Faalak;
        System.out.println("Gross Dhaanda:"+PropertyPerc+" "+Faalak);

    }
    Sheth(int Faalak)
    { 
        this();
         this.Faalak = Faalak;
         System.out.println("Fakt Faalak:"+Faalak);
    }
    Sheth()
    {
        // this(34,55);

        System.out.println("Default !!");

    }
}
public class ConstructorChaining
{
    public static void main(String[] args) {
        
        Sheth s = new Sheth(22,44);
    }
}