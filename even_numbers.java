import java.util.Scanner;

public class even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        for(int i = 1; i<=a; i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
        System.out.println("Printed Succesfully");
    }
}
