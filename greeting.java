import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Namaste");
        System.out.println("Press 2 for Hello");
        System.out.println("Press 3 for Bonjour");
        
        System.out.print("Enter the value: ");
        int a = sc.nextInt();

        if (a == 1){
            System.out.println("Namaste");
        }
        else if (a == 2){
            System.out.println("Hello");
        }
        else if (a == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
