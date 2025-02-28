import java.util.*;

class Grade{
	static int num;
	
	public static void main(String args[]) {
		System.out.println("Enter the count of the subject: ");
		Scanner c = new Scanner(System.in);
		num=c.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the marks obtained: ");
		for(int i =0;i<num;i++) {
			a[i]=c.nextInt();
			
			if(a[i]>90 && a[i]<=100) {
				System.out.println("Grade according to the mark obtained is: AA");
			}
			if(a[i]>80 && a[i]<=90) {
				System.out.println("Grade according to the mark obtained is: AB");
			}
			if(a[i]>70 && a[i]<=80) {
				System.out.println("Grade according to the mark obtained is: BB");
			}
			if(a[i]>60 && a[i]<=70) {
				System.out.println("Grade according to the mark obtained is: BC");
			}
			if(a[i]>50 && a[i]<=60) {
				System.out.println("Grade according to the mark obtained is: CD");
			}
			if(a[i]>40 && a[i]<=50) {
				System.out.println("Grade according to the mark obtained is: DD");
			}
			if(a[i]<=40) {
				System.out.println("Fail");
			}
		}
	}
}