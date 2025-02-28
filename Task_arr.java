/*** Getting in one array and printing in another array*/

import java.util.*;

class Task_arr{
	static int number;
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the size value of the array: ");
		number = c.nextInt();
		int arr[] = new int[number];
		int b[]=new int[number];
		System.out.println("Enter the array Elements in the array arr[]: ");
		for(int i=0;i<number;i++) {
			arr[i]=c.nextInt();
			b[i]=arr[i];
		}
		System.out.println("Printing values in b[]: ");                                                                                        
		for(int i=0;i<number;i++) {
			System.out.println(b[i]);
		}
	}         
}