class OneBhk{
    public int RoomArea;
    public int HallArea;
    public int price;

    OneBhk()
    {
        RoomArea = 500;
        HallArea = 700;
        price = 1200000;
    }
    OneBhk(int RoomArea,int HallArea,int price)
    {
        this.RoomArea = RoomArea;
        this.HallArea = HallArea;
        this.price = price;
    }

    void show ()
    {
        System.out.println("Room Area in sq.ft :"+RoomArea);
        System.out.println("Hall Area in sq.ft :"+HallArea);
        System.out.println("Price of One Bhk Flat is:"+price);
    }
}
class TwoBhk extends OneBhk
{
    public int Room2Area;
    TwoBhk()
    {
        Room2Area = 500;
        RoomArea = 500;
        HallArea = 700;
        price = 1800000;

    }
    TwoBhk(int Room2Area,int RoomArea,int HallArea,int price)
    {
        this.Room2Area = Room2Area;
        this.RoomArea = RoomArea;
        this.HallArea = HallArea;
        this.price = price;
    }
    void show()
    {   
        System.out.println("Room1 Area in sq.ft :"+Room2Area);
        System.out.println("Room2 Area in sq.ft :"+RoomArea);
        System.out.println("Hall Area in sq.ft :"+HallArea);
        System.out.println("Price of Two Bhk Flat is:"+price);   
    }
}
public class Flats
{
    public static void main(String[] args) {
        TwoBhk e1 = new TwoBhk(600,400,700,1600000);
        TwoBhk e2 = new TwoBhk(800,300,800,1500000);
        TwoBhk e3 = new TwoBhk(900,500,900,1800000);
        e1.show();
        e2.show();
        e3.show();
    }
}