import java.util.*;

public class Temp {
    public static void main(String args[]) {
        char c = 'A';
        // System.err.println(c++);
        for(int i=1; i<=4; i++) {
            for(int s = 1; s <= i; s++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}