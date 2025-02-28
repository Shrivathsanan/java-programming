import java.util.*;

class Duplicate{
static int number;
static int temp;
	
	public static void main(String args[]) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the size value of the array: ");
		number = c.nextInt();
		int a[]= new int[number]; 
		
		for(int i =0;i<number;i++) {
			a[i]=c.nextInt();
		}
		System.out.println("Duplicate Elements are: ");
		for(int i =0;i<number;i++) {
			for(int j=i+1;j<number;j++) {
				if(a[i]==a[j]) {
					temp=a[j];
					if(temp==a[i]) {
						System.out.println(temp);
					}
				}
			}
		}
		
		
	}
}