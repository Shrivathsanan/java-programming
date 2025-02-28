import java.util.*;

class Profile{
	static String name="shri";
	static int pass=2442;
	public void username() {
		System.out.println(name);
	}
	public void password() {
		System.out.println(pass);
	}
}
class Updation extends Profile{
	public void username() {
		name="Shrivathsanan";
		System.out.println(name);
	}
	public void password() {
		pass=9358;
		System.out.println(pass);
	}
	public static void main(String args[]) {
		Updation obj = new Updation();
		Profile obj1=new Profile();
		System.out.println("Old username "+obj1.name+" is converted into ");
		obj.username();	
		System.out.println("Old password "+obj1.pass+" is changed into ");
		obj.password();
	}
}