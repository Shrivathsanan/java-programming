interface iphone13{
	void details();
	static void spec() {
		System.out.println("OS: IOS");
	}
}
interface iphone13Mini extends iphone13{
	void details();
}
interface iphone13Pro extends iphone13Mini{
	void detail();
}
interface iphone13ProMax extends iphone13Pro{
	void detail();
}
class Iphone implements iphone13,iphone13Mini,iphone13Pro,iphone13ProMax{
	public void details() {
		System.out.println("Dual camera setup");
	}
	public void detail() {
		System.out.println("Triple Camera setup");
	}
	public static void main(String args[]) {
		Iphone o = new Iphone();
		iphone13.spec();
		o.details();
		o.detail();
	}
}
