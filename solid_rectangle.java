public class solid_rectangle {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        // Outer loop for peinting rows
        for (int i = 1; i <=a; i++) {
            // Inner loop for peinting col
            for (int j = 1; j <=b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
