public class CheckPowOf2 {
    public static boolean checkPowOf2(int n) {
        return (n&(n-1)) == 0;
    }


    public static void main(String[] args) {
        int n = 17;
        System.out.println(checkPowOf2(n));
    }
}
