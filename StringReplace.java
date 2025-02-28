import java.util.*;

class StringReplace{
	static String str = " The factory returned class Cake Someone ordered a Dessert! ";
	static int s; 
	public static void main(String args[]) {
		System.out.println("Choose the class name: ");
		System.out.println("1-Cake class and 2-Pizza class");
		Scanner c=new Scanner(System.in);
		s=c.nextInt();
		switch(s) {
		case 1:
			System.out.println(str);
			break;
		case 2:
			str =str.replace("Dessert","Fast Food");
			System.out.println(str.replace("Cake", "Pizza"));
			break;
			
			default:
				System.out.println("Enter the correct value: ");
		}
	}
}