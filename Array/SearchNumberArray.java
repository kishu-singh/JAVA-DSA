import java.util.Scanner;

public class SearchNumberArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int num = sc.nextInt();

        int a[] = new int[num];

        // Input the value
        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        // Print the Array
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the value you want to search: ");
        int x = sc.nextInt();

        // Print the index you of vlaue you searched
        for (int i=0; i<a.length; i++) {
            if(x==a[i]){
                System.out.println(x+" is at index "+i);
            }
        }
    }
}
