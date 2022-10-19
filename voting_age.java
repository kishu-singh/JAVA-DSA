import java.util.Scanner;

public class voting_age {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int age =obj.nextInt();

        if (age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
