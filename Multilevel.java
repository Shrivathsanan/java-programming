class First{
	static int a = 5;
	public void num() {
		a=a+a;
		System.out.println(a);
	}
}
class Sec extends First{
	public void print() {
		a=a+a+a;
	System.out.println(a);
	a=a*a;
	}
}
class Multilevel extends Sec{
	public static void main(String args[]) {
		Multilevel o = new Multilevel();
		o.num();
		o.print();
		System.out.println(a);
	}
}