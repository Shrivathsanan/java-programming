import java.util.*;

class StringTask1{
	
	static int n;
	
	public static void main(String args[]) {
		System.out.println("Enter any input value: ");
		Scanner c = new Scanner(System.in);
		n=c.nextInt();
		if(n > -100 && n < 100) {
			System.out.println("Good Job");
		}
		else {
			System.out.println("Wrong Answer");
		}
	}
}