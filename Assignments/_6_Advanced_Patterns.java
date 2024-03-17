// package Assignments;
// Hollow Rectangle Pattern
// Inverted and Rotated Half-Pyramid Pattern
// Floyd's Triangle Pattern
// 0-1 Triangle Pattern
// Butterfly Pattern
// Solid Rhombus Pattern
// Hollow Rhombus Pattern
// Diamond Pattern
// Number Pyramid Pattern
// Palindromic Number Pyramid Pattern



// public class _6_Advanced_Patterns {
    
//     public static void hollow_rectangle(int totRows, int totCols) {
//         for(int r=1; r<=totRows; r++) {
//             for(int c=1; c<=totCols; c++) {
//                 if(r==1 || r==totRows || c==1 || c==totCols) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         };
//     };


//     public static void inverted_rotated_halfPyramid (int totRows, int totCols) {
//         for(int i=1; i<=totRows; i++) {
//             for(int j=1; j<=totCols; j++) {
//                 if(j >= (totCols-i+1)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         };
//     };


//     public static void inverted_halfPyramid_Number (int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i+1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         };
//     };


//     public static void floyds_triangle(int n) {
//         int counter=1;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(counter++ + " ");
//             }
//             System.out.println();
//         };
//     };


//     public static void zero_one_triangle(int n) {
//         int x=1;
//         for(int i=1; i<=n; i++) {
//             x= (i%2==0 ? 0 : 1);
//             for(int j=1; j<=i; j++) {
//                 System.out.print(x);
//                 x = (x==1 ? 0 : 1);
//             }
//             System.out.println();
//         };

//         /*
//                 // OR
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 if((i+j) % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//         */
//     };


//     public static void butterfly_pattern(int n) {
//         //1st half of butterfly
//         for(int i=1; i<=n; i++) {
//             //stars --  i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             //spaces --  2(n-i)
//             for(int j=1; j<=2*(n-i); j++) {
//                 System.out.print(" ");
//             }
//             //stars -- i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //2nd half of butterfly
//         for(int i=n; i>=1; i--) {
//             //stars --  i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             //spaces --  2(n-i)
//             for(int j=1; j<=2*(n-i); j++) {
//                 System.out.print(" ");
//             }
//             //stars -- i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         };
//     };


//     public static void solid_rhombus(int n) {
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=(n-i); j++) {
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();            
//         };
//     };


//     public static void hollow_rhombus(int n) {
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=(n-i); j++) {
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=n; j++) {
//                 if((i==1 || i==n || j==1 || j==n)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();            
//         };
//     };
    


//     public static void diamond_pattern(int n) {
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=(n-i); j++) {
//                 System.err.print(" ");
//             }
//             for(int j=1; j<=(2*i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n; i>=1; i--) {
//             //spaces
//             for(int j=1; j<=(n-i); j++) {
//                 System.err.print(" ");
//             }
//             for(int j=1; j<=(2*i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     };


//     public static void number_pyramid(int n) {
//         for(int i=1; i<=n; i++) {
//             //stars
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++) {
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }


//     public static void palindromic_number_pyramid(int n) {
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             //palindrome
//             for(int j=i; j>=1; j--) {
//                 System.out.print(j);
//             }
//             for(int j=2; j<=i; j++) {
//                 System.out.print(j);
//             } 
//             System.out.println();
//         }
//     }


//     public static void main(String[] args) {
//         hollow_rectangle(4, 5);
//         System.out.println();
//         System.out.println();
//         inverted_rotated_halfPyramid(4,4);
//         System.out.println();
//         System.out.println();
//         inverted_halfPyramid_Number(6);
//         System.out.println();
//         System.out.println();
//         floyds_triangle(5);
//         System.out.println();
//         System.out.println();
//         zero_one_triangle(5);
//         System.out.println();
//         System.out.println();
//         butterfly_pattern(5);
//         System.out.println();
//         System.out.println();
//         solid_rhombus(5);
//         System.out.println();
//         System.out.println();
//         hollow_rhombus(5);
//         System.out.println();
//         System.out.println();
//         diamond_pattern(4);
//         System.out.println();
//         System.out.println();
//         number_pyramid(5);
//         System.out.println();
//         System.out.println();
//         palindromic_number_pyramid(5);
//     };
// };


