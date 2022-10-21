public class solid_rhombus {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        for (int i = 1; i<=a; i++) {
            for (int j = 1; j<=a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
