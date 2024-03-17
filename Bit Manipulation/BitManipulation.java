public class BitManipulation {
    static void decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    }

    static long binaryToDecimal(long n)
    {
        long num = n;
        long dec_value = 0;
 
        // Initializing base
        // value to 1, i.e 2^0
        long base = 1;
 
        long temp = num;
        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        return (long)dec_value;
    }
    
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n&bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {  // makes ith bit 1
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i) {  // makes ith bit 0
        int bitMask = ~(1<<i);
        return n&bitMask;

    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        //OR
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (-1)<<i;
        return n&bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }




    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(14, 0));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 1, 1));
        System.out.println(clearLastIBits(14, 2));
        System.out.println((binaryToDecimal(100111010011L)));
        System.out.println(clearRangeOfBits(2515, 2, 7));

    }
}
