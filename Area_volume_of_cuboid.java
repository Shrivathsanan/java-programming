import java.util.*;

class Area_volume_of_cuboid{
    static int length;
    static int breadth;
    static int height;
    static int volume
    public static void main(String args[]){
        System.out.println("Enter values l, b and h : ");
        Scanner c = new Scanner(System.in);
        length=c.nextInt();
        breadth=c.nextInt();
        height=c.nextInt();
        volume=(length*breadth*height);
        System.out.println("volume of cuboid: "+volume);
    }
}