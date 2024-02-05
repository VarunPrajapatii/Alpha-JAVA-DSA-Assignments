import java.util.*;

public class _3_Conditional_Questions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int num = sc.nextInt();
        if (num % 4 == 0) {
            if(num % 100 == 0) {
                if(num % 400 == 0) {
                    System.out.println("Its a leap year...");
                }
                else {
                    System.out.println("Not a leap year...");
                }
            }
            else {
                System.out.println("Not a leap year...");
            }
        }
    };
};