import java.util.*;

class Name{
	static String name;
	
	Name(){
		System.out.println("Unknown");
	}
	Name(String name){
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter any name: ");
		Scanner c =  new Scanner(System.in);
		name=c.next();
		Name obj1 = new Name(name);
		Name obj2 = new Name();
		
		
	}
}