public class SolidRhombusPattern {
    public static void main(String[] args) {
        int a=5;

        for (int i=1; i<=a; i++) {
            
            // Spaces
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j=1; j<=a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
