import java.util.*;
public class Over{
	void a() {
		System.out.println("hello");
	}
		void a(String b) {
			System.out.println("hey"+b);
		}
	
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
				String b=scan.next() ;
			Over obj=new Over();
			obj.a(b);
	}
}