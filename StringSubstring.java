import java.util.*;

class StringSubstring{
	static String str; 
	static int start,end;
	public static void main(String args[]) {
		System.out.println("Enter a input String: ");
		Scanner c=new Scanner(System.in);
		str=c.next();
		System.out.println("Enter a start and end for separating into substring: ");
		start=c.nextInt();
		end=c.nextInt();
		str=str.substring(start, end);
		System.out.println(str.replaceFirst("l","L"));
		
	}
}