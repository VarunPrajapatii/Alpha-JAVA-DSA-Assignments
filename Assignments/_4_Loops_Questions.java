// Question 1 : How many times 'Hello' is printed?


// public class _4_Loops_Questions {
//     public static void main(String[] args){
//         for(int i=0; i<5; i++) {
//         System.out.println("Hello");
//         i+=2;
//         }
//     };
// };





// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.

// import java.util.*;

// public class _4_Loops_Questions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         int number;

//         do {
//             System.out.println("Enter the number: ");
//             number = sc.nextInt();
            
//             if(number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }
//             System.out.println("If you want to add more number then Press 1 otherwise Press 0");
//             choice = sc.nextInt();
//         } while (choice==1);

//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     };
// };






// Question 3 : Write a program to find the factorial of any number entered by the user.
// (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
// only. We write factorial as n!
// So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
// Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)


// import java.util.*;

// public class _4_Loops_Questions {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number to find the factorial of: ");
        
//         int number = sc.nextInt();
//         int fact = 1;

//         for(int i = 1; i<=number; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial of " + number + " is " + fact);
//     };
// };








// Question 4 : Write a program to print the multiplication table of a number N, entered by the
// user.


// import java.util.*;

// public class _4_Loops_Questions {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number to print its table: ");
//         int num = sc.nextInt();
//         for(int i = 1; i <=10; i++) {
//             System.out.println(num + " x " + i + " = " + (num*i));
//         }
//     };
// };



// Question 5 : What is wrong in the following program?



// public class _4_Loops_Questions {
//     public static void main(String args[]) {
        
//         for(int i = 0; i <= 5; i++ ) {
//             System.out.println("i = " + i );
//         }
        
//         System.out.println("i after the loop = " + i );
//     };
// };

// Solution 5: Scope of variable is referred to the part of the program where the variable can be used.
// In this program variable i is declared in the for loop. So scope of variable i is limited to the for
// loop only that is between { and } of the for loop. There is a display statement after the for loop
// where variable i is used which means i is used out of scope. This leads to compilation errors.
// The program given will not run and give an error instead. To correct the program, the variable i
// needs to be declared outside the for loop.