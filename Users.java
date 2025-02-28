import java.util.*;


class Users{
	static String name;
	static String email;
	static int phone_no;
	static int pin;
	
	
	static String namecheck="shri";
	static String emailcheck="shri@gmail.com";
	static int phone_nocheck=93606190;
	static int pincheck=2442;
	
	public void inputs() {
		Scanner c = new Scanner(System.in);
		name=c.next();
		email=c.next();
		phone_no=c.nextInt();
		pin=c.nextInt();
		}
	public static void main(String args[]) {
		Scanner c =  new Scanner(System.in);
		int n=c.nextInt();
		User a[]=new User[n];
		
		for(int i=0;i<n;i++) {
			Users use=new Users();
			use.inputs();
			User useri=new User(name,email,phone_no,pin);
			a[i]=useri;
		}
		for(int i=0;i<n;i++) {
			
			if(a[i].getName().equals(namecheck) && a[i].getPin()==pincheck) {
				System.out.println(a[i].getName()+" "+a[i].getPin());
			}
		}
	}
}