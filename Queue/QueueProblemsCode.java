package Queue;
import java.util.*;
import java.util.LinkedList;

public class QueueProblemsCode {
    
    //First non repeating character problem
    public static void firstNonRepeatingChar(String str) {
        int[] arr = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            arr[ch - 'a']++;
            
            while(!q.isEmpty() && arr[q.peek()-'a'] >1) {
                q.remove();
            }
            if(q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeatingChar(str);
    }
}