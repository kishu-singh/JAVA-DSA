public class hollow_rectangle {
     public static void main(String[] args) {
        int a=4;
        int b=5;
        
        // Outer loop for Rows
        for (int i=1; i<=a; i++){
            // Inner loop Column
            for (int j = 1; j <= b; j++) {
                if (i==1||j==1||i==a||j==b) {
                  System.out.print("*");  
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
     }
}
