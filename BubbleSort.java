import java.util.*;

class BubbleSort{
	static int num;
	static int temp;
	public static void main(String args[]) {
		
		System.out.println("Enter the count of the inputs: ");
		Scanner c = new Scanner(System.in);
		num=c.nextInt();
		int a[]=new int[num];
		System.out.println();
		for(int i=0;i<num;i++) {
			a[i]=c.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
			}
		System.out.println();
		System.out.println("Sorted output for the given input is: ");
		for(int i=0;i<num;i++) {
			System.out.println(a[i]);
		}
		}
		
	}