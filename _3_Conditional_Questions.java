// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.

// import java.util.*;

// public class _3_Conditional_Questions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to check if its positive or negative : ");
//         float num = sc.nextFloat();
//         if(num >= 0){
//             System.out.println("Number is Positive");
//         } else {
//             System.out.println("Number is Negative");
//         }
//     };
// };





// Question 2 : Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.


// public class _3_Conditional_Questions {
//     public static void main(String args[]) {
//         double temp = 103.5;
//         if(temp>100) {
//             System.out.println("You have Fever...");
//         } else {
//             System.out.println("You dont have Fever...");
//         }
//     };
// };



// Question 3 : Write a Java program to input week number(1-7) and print day of week name
// using switch case.


// import java.util.*;

// public class _3_Conditional_Questions {
//     public static void main(String args[]) {
//         System.out.println("Enter number from 1-7 to know the day: ");
//         Scanner sc = new Scanner(System.in);
//         int inp = sc.nextInt();
//         switch (inp) {
//             case 1 : System.out.println("Monday"); break;
//             case 2 : System.out.println("Tuesday"); break;
//             case 3 : System.out.println("Wednesday"); break;
//             case 4 : System.out.println("Thursday"); break;
//             case 5 : System.out.println("Friday"); break;
//             case 6 : System.out.println("Saturday"); break;
//             case 7 : System.out.println("Sunday"); break;
//             default: System.out.println("Entered wrong input...");
//         }
//     };
// };




// Question 4 : What will be the value of x & y in the following program:

// public class _3_Conditional_Questions {
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b ) ? true : false;
//         int y = (a > b ) ? a : b;
//         System.out.println(x);
//         System.out.println(y);
//     }
// }




// Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.


// import java.util.*;

// public class _3_Conditional_Questions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year: ");
//         int num = sc.nextInt();
        
//         boolean x = (num % 4 ) == 0;
//         boolean y = (num % 100) != 0;
//         boolean z = ((num % 100 == 0) && (num % 400 == 0));

//         if(x && (y || z)) {
//             System.out.println(num + " is a leap year");
//         } else {
//             System.out.println(num + " is not a leap year");
//         }
//     };
// };