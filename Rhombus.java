import java.util.*;

class Rhombus{
    static int diagonal1;
    static int diagonal2;
    static double rhombus;
    
    public static void main(String args[]){
        Scanner c = new Scanner(System.in);
        diagonal1=c.nextInt();
        diagonal2=c.nextInt();
        rhombus = (diagonal1*diagonal2)/2;
        System.out.println("Area of Rhombus: "+ rhombus);
    }
}