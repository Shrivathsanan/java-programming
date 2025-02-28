import java.util.*;

class Laptops{
	public static void main(String args[]) {
		System.out.println("Enter the required detail: ");
		Scanner c =new Scanner(System.in);
		int n=c.nextInt();
		
		
		Laptop array2[]=new Laptop[n];
		
		for(int i=0;i<n;i++) {
			String brand=c.next();
			String model=c.next();
			int price=c.nextInt();
			int version =c.nextInt();
		Laptop customer_i=new Laptop(brand,model,price,version);
		array2[i]=customer_i;
		System.out.println(" lap entered successfully");
		}
		
//		Object array[]=new Object[5];
		
//		{customer,customer1,customer2,customer3};
		
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i].getBrand());
		}
		for(Laptop l:array2) {
			
			System.out.println("brand name is"+l.getBrand());
			System.out.println("model name is"+l.getModel());
		}
	}
}