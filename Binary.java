import java.util.*;
class Binary{
	static int key;
	static int n;
	 
	public int search() {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the count of the elements: ");
		n=c.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the sorted array inputs: ");
		for(int i=0;i<n;i++) {
			a[i]=c.nextInt();
		}
		
		int low=0;
		 int high =n-1;
		 
		 System.out.println("Enter the key value to find in the array: ");
			key=c.nextInt();
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==key) {
				return mid;
			}
			if(a[mid]>key) {
				high=mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
		
	}
	public static void main(String args[]) {
		Binary obj=new Binary();
		int result=obj.search();
		if(result==-1) {
			System.out.println("Entered key " + key + " is not found");
		}
		else {
		System.out.println("The endered key "+ key + " found in "+result + " position");
		}
		}
}