import java.util.*;

class Overloading{
	
	void display() {
		System.out.println("There is nothing inside this block");
	}
	void display(String a) {
		System.out.println(a);
	}
	void display(String a,String b) {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		System.out.println("Enter your name");
		Scanner c = new Scanner(System.in);
		String a=c.next();
		System.out.println("Enter your second name");
		String b=c.next();
		Overloading obj = new Overloading();
		obj.display(a, b);
		
	}
}