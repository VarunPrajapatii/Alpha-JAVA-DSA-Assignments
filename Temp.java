import java.util.*;

public class Temp {
    
    public static void main(String[] args) {
        String str = "abcc";
        StringBuilder sb = new StringBuilder("");

        int count =0;
        char temp;
        int i=0;
        temp = str.charAt(i);
        while(i<str.length()) {
            if(temp==str.charAt(i)) {
                count++;
                i++;
            }
            else {
                sb.append(temp);
                sb.append(count);
                count=0;
                temp=str.charAt(i);

            }
        }
        sb.append(temp);
        sb.append(count);
        System.out.println(sb.toString());
    }
}