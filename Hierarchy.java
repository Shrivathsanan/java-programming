class one{
	static int a=900;
	public void add() {
	System.out.println(a);
	}
}
class two extends one{
	public void mtd() {
		a=a*a;
	System.out.println(a);
	}
}
class Hierarchy extends one{
	public static void main(String args[]) {
		Hierarchy obj = new Hierarchy();
		obj.add();
		a=a+a+a+a;
		System.out.println(a);
		two o = new two();
		o.mtd();
		
		
	}
}