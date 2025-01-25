import java.util.*;

class Area{

static double radius = 25.2;
static double area=0;
static double perimeter=0;

public void area_of_circle(){

area = Math.PI*(radius*radius);

}

public void perimeter_of_circle(){

perimeter = 2*(Math.PI*radius);

}
public static void main(String args[]){

Area object = new Area();

object.area_of_circle();
object.perimeter_of_circle();

System.out.println("Area of the circle is :"+ area);
System.out.println("Perimeter of the circle is :"+ perimeter);

}

}