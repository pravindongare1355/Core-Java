import java.util.*;

class Tile{
    public int EdgeLength;
    Tile(int EdgeLength)
    {
        this.EdgeLength = EdgeLength;
    }

}
class Floor extends Tile
{  
    private int length;
    private int width;

    Floor(int EdgeLength,int length,int width)
    { 
          super(EdgeLength);
          this.length = length;
          this.width = width;
    }
    void totalTiles(Tile t)
    {
        int l = this.length;
        int w = this.width;
         float area = l*w;

         float TotalTiles = t.EdgeLength/(float)area;

         System.out.println("Total Area is:"+area+" "+"Total Tiles Required is:"+TotalTiles);
        
        
    }
}
public class EdgeOfSquare{
    public static void main(String[] args) {
        Floor e = new Floor(55,3,6);
        e.totalTiles(e);
    }
}