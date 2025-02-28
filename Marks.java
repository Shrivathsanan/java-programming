import java.util.*;

interface score{
	void marks(String name,String Register_no,int sub_count,int sum,double avg); 
}
class School implements score{
	public void marks(String name,String Register_no,int sub_count,int sum,double avg) {
	
		
		System.out.println("\n -----School Level Result-----");
		System.out.println("name: "+name);
		System.out.println("Register number : "+Register_no);
		System.out.println("No of subjects: "+sub_count);
		
		System.out.println("Average: "+avg);
		
		if(avg>=90&&avg<100) {
			System.out.println("grade: O");
		}
		if(avg>=80&&avg<90) {
			System.out.println("grade: A+");
		}
		if(avg>=70&&avg<80) {
			System.out.println("grade: A");
		}
		if(avg>=60&&avg<70) {
			System.out.println("grade: B+");
		}
		if(avg>=50&&avg<60) {
			System.out.println("grade: B+");
		}
		if(avg>=45&&avg<50) {
			System.out.println("grade: C");
		}
		if(avg<45) {
			System.out.println("Fail");
		}
	}
}

class College implements score{
	public void marks(String name,String Register_no,int sub_count,int sum,double avg) {
		
		
		
		System.out.println("-----Graduate Level Result-----");
		System.out.println("name: "+name);
		System.out.println("Register number : "+Register_no);
		System.out.println("No of subjects: "+sub_count);
		
		System.out.println("Average: "+avg);
		
		if(avg>=90&&avg<100) {
			System.out.println("grade: O");
		}
		if(avg>=80&&avg<90) {
			System.out.println("grade: A+");
		}
		if(avg>=70&&avg<80) {
			System.out.println("grade: A");
		}
		if(avg>=60&&avg<70) {
			System.out.println("grade: B+");
		}
		if(avg>=50&&avg<60) {
			System.out.println("grade: B+");
		}
		if(avg>=45&&avg<50) {
			System.out.println("grade: C");
		}
		if(avg<45) {
			System.out.println("RA "+"- Fail");
		}
		
	}
}
class Marks {
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		String name,Register_no,grade;
		int sub_count,sum;
		double avg;
		System.out.println("Enter your name: ");
		name = c.next();
		System.out.println("Enter your Register no: ");
		Register_no = c.next();
		System.out.println("Enter your subject count: ");
		sub_count = c.nextInt();
		int a[]=new int[sub_count];
		sum=0;
		System.out.println("Enter marks obtained in each subjects: ");
		for(int i=0;i<sub_count;i++) {
			a[i]=c.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Total Mark scored out of "+sub_count*100+": "+sum);
		
		avg=sum/sub_count;
		System.out.println(avg);
		
		String Register;
			int sub;
			System.out.println("\n ----college section---");
			System.out.println("Enter your Register no: ");
			Register = c.next();
			System.out.println("Enter your subject count: ");
			sub = c.nextInt();
			int b[]=new int[sub];
			sum=0;
			System.out.println("Enter marks obtained in each subjects: ");
			for(int i=0;i<sub;i++) {
				b[i]=c.nextInt();
				sum=sum+b[i];
			}
			System.out.println("Total Mark scored out of "+sub*100+": "+sum);
			double av=sum/sub;
			
			School obj = new School();
			obj.marks(name, Register_no, sub_count, sum, avg);
			College obj1 = new College();
			obj1.marks(name,Register,sub,sum,av);
				}
}