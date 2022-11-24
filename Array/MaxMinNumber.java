import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i=0; i<size; i++) {
            num[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<num.length; i++) {
           
            if (num[i]< min) {
                min = num[i];
           }

           if (num[i]> max) {
                max = num[i];
           }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
