import java.util.*;

class SumArray{
	public static void main(String args[]) {
		System.out.println(" Enter the count: ");
		int num;
		int sum=0;
		int add=0;
		Scanner c= new Scanner(System.in);
		num=c.nextInt();
		int a[]= new int[num];
		for(int i=0;i<num;i++) {
			a[i]=c.nextInt();
		}
			for(int i=0;i<num;i++) {
				if(a[i]%2==0) {
					sum=sum+a[i];
					
				}
				if(a[i]%2!=0) {
					add=add+a[i];
					
				}
			}
			System.out.println("even sum is: "+sum);
			System.out.println("odd sum is: "+add);
			}
	}
