import java.util.*;

class Volume{
static double radius = 5.0;
static double height = 10.0;
static double volume = 0;

public void find(){
volume = Math.PI*((radius*radius)*height);
}

public static void main(String args[]){

Volume object = new Volume();
object.find();

System.out.println("the volume of the cylinder is: "+volume);
}
}