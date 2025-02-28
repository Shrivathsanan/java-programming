import java.util.*;

class SeriesSum{
	static int n; 
	static int sum = 0;
	static int term = 0;
public static void main(String args[]) {
	System.out.println("Enter the number: ");
	Scanner c = new Scanner(System.in);
	n=c.nextInt();
	for(int i=0;i<n;i++) {
		term=term*10+1;
		sum=sum+term;
	}
	System.out.println(sum);
}
}