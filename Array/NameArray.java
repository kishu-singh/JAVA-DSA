import java.util.Scanner;

public class NameArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];
        
        System.out.println("Enter the names :");
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
