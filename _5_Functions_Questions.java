// Question 1 : Write a Java method to compute the average of three numbers..



// import java.util.*;

// public class _5_Functions_Questions {

//     public static double average(double x, double y, double z) {
//         return ((x+y+z)/3);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3 numbers to find average");
//         double x = sc.nextDouble();
//         double y = sc.nextDouble();
//         double z = sc.nextDouble();
        
//         System.out.println("Average is: " + average(x, y, z));
//     };
// };




// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

// import java.util.*;


// public class _5_Functions_Questions {
    
//     public static boolean isEven(int num) {    
//         if(num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         if(isEven(num)) {
//             System.out.println("Number is Even");
//         } else {
//             System.out.println("Number is Odd");
//         }
//     };
// };






// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.


// import java.util.*;

// public class _5_Functions_Questions {

//     public static boolean isPlaindrome(int num) {
//         int temp=num;
//         int rev=0;
//         while(temp!=0) {
//             rev =(rev*10) + (temp%10);
//             temp /= 10;
//         }
//         if(num==rev) {
//             return true;
//         } else {
//             return false;
//         }
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to check if its palindrome or not: ");
    
//         int num = sc.nextInt();
        
//         if(isPlaindrome(num)) {
//             System.out.println("Number is Palidrome.");
//         } else {
//             System.out.println("Number is not Palindrome");
//         }

//     };
// };






// Question 4 : READ & CODE EXERCISE
// Search about (Google) & use the following methods of the Math class in Java:
// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )
// Free reading resource (https://www.javatpoint.com/java-math)
// Please feel free to look for more resources/websites on your own.






// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )


// import java.util.*;

// public class _5_Functions_Questions {

//     public static int sumDigits(int num) {
//         int sum = 0;
//         while (num!=0) {
//             sum=sum+(num%10);
//             num=num/10;
//         }
//         return sum;
//     };

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number to find the sum of its digits: ");
//         int num = sc.nextInt();
        
//         System.out.println("Sum of digits is: "+ sumDigits(num));
//     };
// };