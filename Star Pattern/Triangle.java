public class Triangle {
    public static void main(String[] args) {
        // pattern2_brute_force(7);
        // pattern1_brute_force(3);
        // pattern1_otpimized(4);
        // pattern3_brute_force(4,5);
        // pattern3_optimized(4,5);
        // inverted_half_pyramid_brute_force(4,4);
        // inverted_half_pyramid_optimized(4,4);
        // rotated_pyramid_180(4,4);
        // rotated_pyramid_180_optimized(4,4);
        // rotated_pyramid_invert(4, 4);
        // rotated_pyramid_inverted_optimized(4,4);
        // half_pyramid_with_numbers(4,4);
        // half_pyramid_with_numbers_reverse(5);
        // floyds_triangle(4);
        zero_one_triangle();
        
    }

    // HALF - PYRAMID
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

    // FULL - PYRAMID
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

    // HOLLOW RECTANGLE
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

    // INVERTED - HALF - PYRAMID
    // T.C --> O(n2)
    public static void inverted_half_pyramid_brute_force(int rows, int columns){
        for (int i=1; i<=rows; i++){
            for (int j=columns; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();    
        }
    }

    public static void inverted_half_pyramid_optimized(int rows, int columns){
        for (int i=1; i<=rows; i++){
            String printRows = "*".repeat(columns-i+1);
            System.out.println(printRows);
        }
    }

    // INVERTED - HALF - PYRAMID - ROTATED 180 DEGREE
    // T.C --> O(n2)
    public static void rotated_pyramid_180(int rows, int columns){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // T.C --> O(n)
    public static void rotated_pyramid_180_optimized(int rows, int columns){
        for (int i=1; i<=rows; i++){
            String emptySpace = " ".repeat(columns-i);
            String star = "*".repeat(i);
            System.out.println(emptySpace+star);
        }
    }

    public static void rotated_pyramid_invert(int rows, int columns){
        for (int i=rows; i>=1; i--){
            for (int j=1; j<=columns-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rotated_pyramid_inverted_optimized(int rows, int columns){
        for (int i=rows; i>=1; i--){
            String emptySpace = " ".repeat(columns-i);
            String star = "*".repeat(i);
            System.out.println(emptySpace+star);
        }
    }

    public static void half_pyramid_with_numbers(int rows, int columns){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void half_pyramid_with_numbers_reverse(int nums){
        for (int i=nums; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //FLOYD'S TRIANGE
    public static void floyds_triangle(int level){
        int count = 1;
        for (int i=1; i<=level; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(){
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                int sum = i+j;
                System.out.print((sum % 2 == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}