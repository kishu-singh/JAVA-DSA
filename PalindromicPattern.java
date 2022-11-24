public class PalindromicPattern {
    public static void main(String[] args) {
        int a=5;

        for (int i=1; i<=a; i++) {
            // Spaces
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // First Half Numbers
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            // Second Half Numbers
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
