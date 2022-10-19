import java.util.Scanner;

public class sum_natural_number {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int sum = 0;
      int i;
      for(i=1; i<=a; i++){
        sum = sum + i;
      }
      System.out.println(sum);
    }
}
