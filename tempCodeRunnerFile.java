

public class _5_Functions_Questions {
    
    public static boolean isEven(int num) {    
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    };
};