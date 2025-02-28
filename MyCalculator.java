/*** divisor sum calculator*/

import java.util.*;

interface AdvancedArithemetics{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithemetics{
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				
				sum=i+sum;
			}
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		System.out.println("Enter any number: ");
		Scanner c = new Scanner(System.in);
		int n=c.nextInt();
		MyCalculator obj = new MyCalculator();
		int result = obj.divisor_sum(n);
		System.out.println("\n output: "+result);
	}
}