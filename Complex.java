import java.util.*;

class Complex{
	static int real1;
	static int real2;
	static double ima1;
	static double ima2;
	static int sum_real;
	static double sum_ima;
	static int difference_real;
	static double difference_ima;
	static int product_real;
	static double product_ima;
	
	public void add() {
		sum_real=real1+real2;
		sum_ima=ima1+ima2;
	}
	public void difference() {
	difference_real=real1-real2;
	difference_ima=ima1-ima2;
		
	}
	public void multiply() {
	product_real=real1*real2;
	product_ima=ima1*ima2;
	
}
	
	public static void main(String arg[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter real part of comlex number 1: ");
		real1=c.nextInt();
		System.out.println("Enter imaginary part of comlex number 1: ");
		ima1=c.nextInt();
		System.out.println("Enter real part of comlex number 2: ");
		real2=c.nextInt();
		System.out.println("Enter imaginary part of comlex number 2: ");
		ima2=c.nextInt();
		Complex object = new Complex();
		object.add();
		object.difference();
		object.multiply();
		
		System.out.println("sum of the two complex numbers= "+ sum_real + " + "+ sum_ima +"i");
		System.out.println("difference of the two complex numbers= "+ difference_real + " + "+ difference_ima +"i");
		System.out.println("product of the two complex numbers= "+ product_real + " + "+ product_ima +"i");
		
	}
}