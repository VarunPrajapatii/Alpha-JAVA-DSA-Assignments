// Questions 1 : Count how many times lowercase vowels occured in a String entered by the user.


// import java.util.*;

// public class _9_Strings_Questions {
//     public static void main(String[] args) {
//         System.out.println("Enter a string: ");
//         String str = new Scanner(System.in).nextLine();
//         int count = 0;
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }
//         System.out.println("The number of vowels in the string are: " + count);
//     };
// };




// Question 2 : What will be the output of the following code?


// public class _9_Strings_Questions {
//     public static void main(String[] args) {
//         String str = "ShradhaDidi";
//         String str1 = "ApnaCollege";
//         String str2 = "ShradhaDidi";
//         System.out.println(str.equals(str1) + " " + str.equals(str2));
//     };
// };
// Output - false true




// Question 3 : What will be the output of the following code?


// public class _9_Strings_Questions {
//     public static void main(String[] args) {
//         String str1 = "ApnaCollege".replace("l","");
//         System.out.println(str1);
//     };    
// };
// Output - ApnaCoege




// Question 4 : Determine if 2 Strings are anagrams of each other.
// What is anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider
// race and care. In this case, race's characters can be formed into a care, or care's characters can be formed 
// into race. Below is a java program to check if two strings are anagrams or not.


// import java.util.Arrays;

// public class _9_Strings_Questions {

//     public static boolean checkAnagrams(String str1, String str2) {
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();
//         if(str1.length() == str2.length()) {
//             char char1[] = str1.toCharArray();
//             char char2[] = str2.toCharArray();
    
//             Arrays.sort(char1);
//             Arrays.sort(char2);
            
//             return Arrays.equals(char1, char2);
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String str1 = "earth";
//         String str2 = "heart";
//         boolean result = checkAnagrams(str1, str2);
//         if(result){
//             System.out.println("Strings '" + str1 + "' and '" + str2 + "' are anagrams..");
//         } else {
//             System.out.println("Strings '" + str1 + "' and '" + str2 + "' are not anagrams..");
//         }
//     };
// };