import java.util.*;

class Task_arr_Frequency{
	static int number;
	
	public static void main(String args[]) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the size value of the array: ");
		number = c.nextInt();
		int a[]= new int[number]; 
		
		for(int i =0;i<number;i++) {
			a[i]=c.nextInt();
		}
		
		for(int i =0;i<number;i++) {
			for(int j=i+1;j<number;j++) {
				if(a[i]==a[j]) {
						System.out.println(a[j]);
				}
			}
		}
		
	}
}