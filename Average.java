import java.util.*;


class Average{
	static int number;
	static int sum=0;
	static double average;
	
	public static void main(String arg[]) {
		System.out.println("Enter a number: ");
		Scanner c=new Scanner(System.in);
	    number=c.nextInt();
	    int a[]=new int[number];
	    System.out.println("Enter a inputs: ");
	    for(int i=0;i<number;i++) {
			a[i]=c.nextInt();
			sum=sum+a[i];
		}
	    average=sum/number;
	    System.out.println("Average of the entered values are: "+average);
	}
}