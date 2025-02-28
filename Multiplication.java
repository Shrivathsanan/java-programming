
import java.util.*;

class Multiplication{
	
static int number;
	
	
	public void multiply() {
		
		for(int i=1; i<=10;i++) {
			System.out.println(number + " x " + i + " = "+ (number*i));
			
		}
	}
	public static void main(String arg[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the Number to find its Multiplication Table: ");
		number=c.nextInt();
		Multiplication obj = new Multiplication();
		obj.multiply();
	}
}