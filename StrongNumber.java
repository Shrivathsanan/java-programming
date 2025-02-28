/*** 145=1!+4!+5! */

import java.util.*;

class StrongNumber{
	static int number;
	static int fact=1;
	static int remainder;
	static int sum=0;
	
	public void factorial(){
		
		while(number>0){	
			remainder=number%10;
			number=number/10;		
			for(int j=1;j<=remainder;j++) {
				fact=fact*j;
			}
			sum=sum+fact;
			fact=1;
		}
	}
public static void main(String args[]) {
	System.out.println("Enter the number: ");
	Scanner c = new Scanner(System.in);
	number=c.nextInt();
	int reference=number;
	StrongNumber obj=new StrongNumber();
	obj.factorial();
	if(reference==sum) {
		System.out.println("The entered number is Strong number");
	}
	else {
		System.out.println("Weak number");
	}
}
}