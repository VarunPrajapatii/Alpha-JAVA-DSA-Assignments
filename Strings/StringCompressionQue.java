package Strings;

public class StringCompressionQue {
    public static String stringCompression(String str) {
        int i=0;
        char ch;
        StringBuilder sb = new StringBuilder("");
        int count=0;
        ch = str.charAt(i);
        while(i<str.length()) {
            if(str.charAt(i) == ch) {
                count++;
                i++;
            } else {
                sb.append(ch);
                sb.append(count);
                ch = str.charAt(i);
                count=0;
            }
        }
        sb.append(ch);
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbcccdd";
        System.out.println(stringCompression(str));
    }
}
