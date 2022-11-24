public class DiamondPattern {
    public static void main(String[] args) {
        int a=4;

        // Upper Half
        for (int i=1; i<=a; i++) {
            // Spaces
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // Stars
            int stars = 2*i-1;
            for (int j=1; j<=stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i=a; i>=1; i--) {
            // Spaces
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // Stars
            int stars = 2*i-1;
            for (int j=1; j<=stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
