class Class1{
	static String b;
	public void str() {
		b="Shri";
		System.out.println(b);
}
}
class Class2 extends Class1{
	static int a = 5;
	public void num() {
		a=a+a;
		System.out.println(a);
	}
}
class Class3 extends Class2{
	public void print() {
		a=a+a+a;
	System.out.println(a);
	a=a*a;
}
}
class Class4 extends Class3{
	public void max() {
	a=a+a+a+a;
	System.out.println(a);
}
}
class Class5 extends Class3{
	public void min() {
	a=a++;
	System.out.println(a);
	}
}
class Hybrid extends Class5{
	public static void main(String args[]) {
		Hybrid c=new Hybrid();
		c.str();
		c.min();
		c.num();
		c.print();
		Class4 o =new Class4();
		o.max();
	}
}