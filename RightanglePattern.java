import java.util.*;

class RightanglePattern{
	static int number;
	
	public static void main(String args[]) {
		System.out.println("Enter the number: ");
		Scanner c = new Scanner(System.in);
		number=c.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}