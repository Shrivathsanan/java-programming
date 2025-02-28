/*** InterfaceInherit */

interface Greet{
	int a=10;
	void add();
}
interface Access extends Greet{
	int b=20;
	void sub();
}
class InterfaceInherit implements Access{
	public void add() {
		int c=a+a;
		System.out.println(c);
	}
	public void sub() {
		int c=b-a;
		System.out.println(c);
	}
	public static void main(String args[]) {
		InterfaceInherit obj = new InterfaceInherit();
		obj.add();
		obj.sub();
	}
}