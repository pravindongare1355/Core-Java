/*42.	Create a class Tile to store the edge length of a square tile, and create another class Floor to store 
length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument 
to calculate the whole number of tiles needed to cover the floor completely.*/

class Tile{
    int sqLength;
    Tile(int sqLength){
        this.sqLength = sqLength;
    }

}
class Floor extends Tile{
    int length;
    int width;
    Floor(int sqLength, int length , int width){
        super(sqLength);
        this.length = length;
        this.width = width;
    }
    void totalTiles(Tile t){
        int l = this.length;
        int w = this.width;
        int area = l*w;
        float totalTitle = t.sqLength / (float)area;
        System.out.println(String.format("%.3f" , totalTitle));
       
    }
}

class Main42{
    public static void main(String[] agrs){
        Floor f = new Floor(200 ,3,3);
        f.totalTiles(f);
    }
}