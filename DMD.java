/*** Dynamic method dispatch */

interface Writable{
	void write();
}
interface note{
	void noted();
}
class DMD implements Writable{
	public void write() {
		System.out.println("Dynamic method dispatch");
	}
	public void noted() {
		System.out.println("bye");
	}
	public static void main(String args[]) {
		Writable obj = new DMD();
		obj.write();
	}
}