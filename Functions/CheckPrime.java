package Functions;
import java.util.*;

public class CheckPrime {
    public static boolean isPrime(int num) {
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not a prime number.");
        }        
    }    
}
