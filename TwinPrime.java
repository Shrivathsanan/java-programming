class TwinPrime {
    public static void main(String[] args) {
        System.out.println("Twin primes less than 100:");
        
        for (int i = 2; i < 100; i++) {
            boolean Prime1 = true;
            boolean Prime2 = true;
            
            // Check if i is prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    Prime1 = false;
                    break;
                }
            }
            
            // Check if i+2 is prime
            for (int j = 2; j * j <= (i + 2); j++) {
                if ((i + 2) % j == 0) {
                    Prime2 = false;
                    break;
                }
            }
            
            // Print twin prime pair
            if (Prime1 && Prime2) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
