import java.util.*;

class Area_volume_of_cube{
    static int edge;
    static int area;
    static int volume;
    public static void main(String args[]){
        System.out.println("Enter value of edge : ");
        Scanner c = new Scanner(System.in);
        edge=c.nextInt();
        area=6*(edge*edge);
        volume=(edge*edge*edge);
        System.out.println("area of cube: "+area);
        System.out.println("volume of cube: "+volume);
    }
}