package Function;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();

        oddEven(num);
    }

    public static void oddEven(int number) {
        if (number<0) {
            System.out.println("Enter the Valid Number");
            return;
        }
        
        if (number%2==0) {
            System.out.println(number+" is Even");
        } else {
            System.out.println(number+" is Odd");
        }
        return;
    }
}
