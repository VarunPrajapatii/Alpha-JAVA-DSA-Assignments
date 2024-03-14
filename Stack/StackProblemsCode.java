package Stack;
import java.util.*;

public class StackProblemsCode {
    //Stack Span Problem
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
    
        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            s.push(i);
        }
    }

    //Next Greater Element
    public static void nextGreater(int arr[], int nextG[]) {
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextG[i] = -1;
            } else {
                nextG[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    //Valid Parenthesis
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if(s.isEmpty()) {
                    return false;
                }
                if((s.peek() == '(' && ch == ')') 
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')) {
                        s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //Duplicate Parenthesis
    public static boolean checkDuplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    s.pop(); //opening pair
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;        
    }


    public static void main(String[] args) {
        // int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks, span);

        // for(int i=0; i<span.length; i++) {
        //     System.out.print(span[i] + " ");
        // }
        // System.out.println();


        // int arr[] = {6, 8, 0, 1, 3};
        // int nextG[] = new int[arr.length];
        // nextGreater(arr, nextG);
        // for(int i=0; i<nextG.length; i++) {
        //     System.out.print(nextG[i] + " ");
        // }
        // System.out.println();

        // System.out.println(isValid("()({})[]"));
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(checkDuplicateParenthesis(str));
        System.out.println(checkDuplicateParenthesis(str2));

    }
}
