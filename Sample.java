interface displayable {
	void display();
}
interface printable{
	void display();
}
class Sample implements displayable,printable{
	public void display() {
		System.out.println("Multiple inheritance can be implemented through Interface");
	}
	public static void main(String args[]) {
		Sample obj = new Sample();
		obj.display();
	}
}