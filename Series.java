import java.util.*;

class Series{
	
	static int q;
	static int a;
	static int b;
	static int n;
	static int sum;
	
	public static void main(String args[]) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the integer input vlaues: ");
		q =c.nextInt();
		System.out.println("Enter the three input value: ");
		for(int i =0;i<q;i++) {
			a = c.nextInt();
			b=c.nextInt();
			n=c.nextInt();
			sum = a;
			for(int j =0;j<n;j++) {
				
				sum = sum + (int)Math.pow(2 , j)*b;
				System.out.println(sum + " ");
			}
			
			System.out.println();
		}
	}
	
}