import java.util.*;

class Second{
	static String a;
	public void print() {
		a="Shri";
		
	}
}
class Single extends Second {
	public static void main(String args[]) {
		Second o = new Second();
		o.print();
		String b=o.a;
		System.out.println(b);
	}
}