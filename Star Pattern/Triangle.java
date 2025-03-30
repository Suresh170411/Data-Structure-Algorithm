public class Triangle {
    public static void main(String[] args) {
        // pattern2_brute_force(7);
        // pattern1_brute_force(3);
        // pattern1_otpimized(4);
        // pattern3_brute_force(4,5);
        pattern3_optimized(4,5);
    }

    // T.C --> O(n2)
    public static void pattern1_brute_force(int levels) {
        for (int i=1; i<=levels; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // T.C --> O(n)
    public static void pattern1_otpimized(int levels) {
        for (int i=1; i<=levels; i++){
            System.out.println("*".repeat(i));
        }
    }

    // T.C --> O(n2)
    public static void pattern2_brute_force(int levels){
        for (int i=1; i<=levels; i++){
            for (int j=1; j<=levels-i; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }

            for (int j=1; j<=levels-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // T.C --> O(n)
    public static void pattern2_optimized(int levels){
        for (int i = 1; i <= levels; i++) {
            // Calculate stars and spaces
            String stars = "*".repeat(2 * i - 1);
            String spaces = "-".repeat(levels - i);

            // Generate and print pattern row
            System.out.println(spaces + stars + spaces);
        }
    }

    // Hollow Rectangle
    // T.C --> O(n2)
    public static void pattern3_brute_force(int rows, int columns){
        // row = i
        // column = j
        //(i==rows/2+1 && j==columns/2+1) --> to print the middle star
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                if (i==1 || j==1 || i==rows || j==columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // T.C --> O(n)
    public static void pattern3_optimized(int rows, int columns){
        String fullRow = "*".repeat(columns);
        String emptyRow = "*" + " ".repeat(columns-2) + "*";

        for (int i=1; i<=rows; i++){
            if (i==1 || i==rows){
                System.out.println(fullRow);
            }else {
                System.out.println(emptyRow);
            }
        }
    }
}