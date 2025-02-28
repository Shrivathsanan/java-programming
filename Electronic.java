import java.util.*;

abstract class Vehicle{
	static String brand;
	static String model;
	static int year;
	abstract void start(String brand,String model,int year);
	abstract void stop();
}
class motor extends Vehicle{
	void start(String brand,String model,int year){
		System.out.println("Bike is Starting.....");
		System.out.println("Brand: "+brand+" , "+"Model: "+model+ " , "+"year: "+year);
	}
	void stop(){
		System.out.println("Bike is stopping...");
	}
}

class Car extends Vehicle{
	void start(String brand,String model,int year){
		System.out.println("Car is Starting.....");
		System.out.println("Brand: "+brand+" , "+"Model: "+model+ " , "+"year: "+year);
	}
	void stop(){
		System.out.println("Car is stopping...");
	}


}

class Electronic extends Car{
	public static void main(String args[]) {
		System.out.println("Enter car details: ");
		Scanner c = new Scanner(System.in);
		brand = c.next();
		model = c.next();
		year = c.nextInt();
		Electronic obj = new Electronic();
		obj.start(brand,model,year);
		obj.stop();
		motor obj1 = new motor();
		System.out.println("\n Enter bike details: ");
		Scanner b = new Scanner(System.in);
		String brand1 = b.next();
		String model1 = b.next();
		int year1 = b.nextInt();
		obj1.start(brand1,model1,year1);
		obj1.stop();
	}
	}