import java.util.*;

class StringCompare{
	static String str1;
	static String str2;
	static String sum;
	static int compare;
	public static void main(String args[]) {
		System.out.println("Enter two input strings");
		Scanner c = new Scanner(System.in);
		str1=c.next();
		str2=c.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		sum = str1+str2;
		System.out.println(sum.length());
		compare=str1.compareTo(str2);
		if(compare>0) {
			System.out.println("Yes");
		}
		if(compare<=0) {
			System.out.println("No");
		}
		System.out.println(str1.replace("h","H") + str2.replace("j"," J"));
		
	}
}