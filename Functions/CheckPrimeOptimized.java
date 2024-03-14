package Functions;
import java.util.*;

public class CheckPrimeOptimized {
    public static boolean isPrime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.println("Number is a Prime number.");
        } else {
            System.out.println("Number is not a Prime number.");
        }
    }
}
