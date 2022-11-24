public class NumberPyramid {
    public static void main(String[] args) {
        int a=5;

        for (int i=1; i<=a; i++) {
            // Spaces
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
