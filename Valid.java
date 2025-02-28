import java.util.Scanner;

public class Valid {
    // Regular expression for validation
    private static final String USERNAME_PATTERN = "^[A-Za-z][A-Za-z0-9_]{7,}$";

    public static boolean isValidUsername(String username) {
        return username.matches(USERNAME_PATTERN);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  // Read the number of usernames
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            if (isValidUsername(username)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}
