public class AdvancePattern {
    public static void main(String[] args) {
        // butterfly_brute_force(4);
        // drawPattern(4);
        // solid_rumbus(5);
        // solid_rumbus_optimized(5);
        // hollow_rumbus(5);
        // hollow_rumbus_optimized(5);
        // pyramid_with_numbers(5);
        // palindromic_pattern(5);
        diamond_pattern(3);
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

    public static void solid_rumbus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=n; j++){
                System.out.print("*");
            }

            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void solid_rumbus_optimized(int n){
        for (int i=1; i<n; i++){
            helper(i, n);
        }
    }

    private static void helper(int i, int n){
        String space = " ".repeat(n-i);
        String star = "*".repeat(n);
        System.out.println(space+star+space);
    }

    public static void hollow_rumbus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            if (i==1 || i==n){
                for (int j=1; j<=n; j++){
                    System.out.print(" * ");
                }
            }else {
                System.out.print("*");
                for (int j=1; j<=n-2; j++){
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
           

            for (int j=1; j<=i-1; j++){
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void hollow_rumbus_optimized(int n){
        for (int i=1; i<=n; i++){
            System.out.print(" ".repeat(n-i));
            if (i==1 || i==n){
                System.out.print("*".repeat(n));
            }else{
                System.out.print("*");
                System.out.print(" ".repeat(n-2));
                System.out.print("*");
            }
            System.out.print(" ".repeat(i-1));
            System.out.println();
        }
    }

    public static void pyramid_with_numbers(int n){
        for (int i=1; i<=n; i++){

            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pattern (int n){
        for (int i=1; i<=n; i++){
           
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //first half numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            //second half numbers
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n){

        // First half
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //second half
         for (int i=n-1; i>=1; i--){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
