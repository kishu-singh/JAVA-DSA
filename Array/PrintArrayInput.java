import java.util.Scanner;

public class PrintArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array");
        int num = sc.nextInt();
        int a[] = new int[num];

        for (int i=0; i<a.length; i++) {
            a[i]= sc.nextInt();
        }

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
