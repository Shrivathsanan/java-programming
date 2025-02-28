public class Constructor
{
	static String name;
	static int id;
	
	Constructor(){
		System.out.println("Constructor created");
		}
	 Constructor(String name,int id) {
		this.name=name;
		this.id=id;
		System.out.println("name");
		System.out.println("id");
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor d=new Constructor();
	}
}

