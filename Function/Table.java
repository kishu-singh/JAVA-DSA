package Function;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        printTable(number);
    }

    public static void printTable(int num) {
        for (int i=1; i<=10; i++) {
            int tab = num *i;
            System.out.println(num+"*"+i+" ="+tab);
        }
        return;
    }
}
