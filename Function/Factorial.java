package Function;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        factorialNumber(num);
    }
    public static void factorialNumber(int number) {
        if (number<0) {
            System.out.println("Invalid");
            return;
        }
        int fact = 1;

        for(int i=number; i>=1; i--){
            fact = fact*i;
        }

        System.out.println(fact);
        return;

    }
}
