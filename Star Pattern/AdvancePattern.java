public class AdvancePattern {
    public static void main(String[] args) {
        // butterfly_brute_force(4);
        drawPattern(4);
    }

    public static void butterfly_brute_force(int n){
        for (int i=1; i<=n; i++){
            
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }

            for (int j=1; j<=2*(n-i); j++){
                System.out.print("   ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--){
            
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }

            for (int j=1; j<=2*(n-i); j++){
                System.out.print("   ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawPattern(int n) {
        // Function to draw one half (increasing or decreasing)
        for (int i = 1; i <= n; i++) {
            drawRow(i, n);
        }
        for (int i = n; i >= 1; i--) {
            drawRow(i, n);
        }
    }
    
    // Helper function to draw a single row
    private static void drawRow(int i, int n) {
        String stars = " * ".repeat(i); // Construct stars
        String spaces = "   ".repeat(2 * (n - i)); // Construct spaces
        System.out.println(stars + spaces + stars); // Combine stars and spaces
    }
}
