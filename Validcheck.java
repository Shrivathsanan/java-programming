import java.util.*;
import java.util.regex.*;

    class Validcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 
        
        // Consume the newline character
        
        for (int i = 0; i < N; i++) {
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
