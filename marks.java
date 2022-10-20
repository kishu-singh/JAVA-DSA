import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("If you want to continue press 1 if not then press 0: ");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("Enter the marks: ");
                int marks = sc.nextInt();

                if (marks <= 59) {
                    System.out.println("This is Good as well");
                } else if (marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks < 90) {
                    System.out.println("This is Good");
                } else {
                    System.out.println("Invalid Marks");
                }
            } else if (a == 0) {
                break;
            }
        }
    }

}
