import java.util.*;

public class Lexiography{
	public static void main(String args[]) {
		System.out.println("Enter a string: ");
		Scanner c = new Scanner(System.in);
		String str=c.next();
		System.out.println("Enter a Number for separating into substring: ");
		int k=c.nextInt();
		
		String smallest = str.substring(0, k);
        String largest = str.substring(0, k);
        
		for (int i = 1; i <= str.length() - k; i++) {
            String sub = str.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
	}
