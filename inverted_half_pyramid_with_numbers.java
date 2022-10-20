public class inverted_half_pyramid_with_numbers {
    public static void main(String[] args) {
        int a = 5;
        // outer loop
        for (int i = a; i >= 1; i--) {
            // inner lop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}