import java.util.*;

class SIB_IIB{
	static int number=20;
	static int variable=20;
	
	static{
		number=number+25;
		System.out.println("Static block: "+number);
	}
	public static void multiply() {
		number=number*number;
		System.out.println("Static method: "+number);
	}
	
	public static void main(String args[]) {
		SIB_IIB obj = new SIB_IIB();
		System.out.println("static variable:"+variable);
		obj.multiply();
		
	}
}