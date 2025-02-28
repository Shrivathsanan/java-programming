import java.util.*;

class Details{
	
	void update(String name) {
		System.out.println(name);
	}
}
class Username extends Details{
	void update(String name) {
		String initial=" R.K";
		System.out.println(name+initial);
	}
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		String n=c.next();
		
		Username obj = new Username();
		obj.update(n);
		
	}
	
}


