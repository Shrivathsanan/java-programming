/*** Multiple Inheritance*/

import java.util.*;

interface phone{
	void add(int a,int b);
}
interface phone1{
	void add(int a,int b);
}
class Multiple implements phone,phone1{
	public void add(int a,int b) {
		a=a*a*a;
		b=b*b*b;
		System.out.println(a +" "+ b);
	}
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		int a=c.nextInt();
		int b=c.nextInt();
		Multiple obj = new Multiple();
		obj.add(a, b);
	}
}