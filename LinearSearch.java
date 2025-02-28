import java.util.*;

class LinearSearch{
	static int key;
	static int a[];
	static int n;
	
	public int search() {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the count of the array: ");
		n=c.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=c.nextInt();
		}
		System.out.println("Enter the key value: ");
		key=c.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
		
			
		}
	public static void main(String args[]) {
		LinearSearch obj=new LinearSearch();
		int result=obj.search();
		if(result==-1) {
			System.out.println("Entered key is not in the array");
		}
		else {
			System.out.println(result);
		}
		}
	
}