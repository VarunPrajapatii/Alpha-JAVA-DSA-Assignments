// Question 1 : Print the number of 7's that are in the 2D Array.
// Example: Input - int[][] array = {{4,7,8},{8,8,7}};
// Output - 2


// public class _8_2D_Arrays_Questions {

//     public static void main(String[] args) {
//         int[][] arr = {{4,7,8},{8,8,7}};
//         int count=0;
//         for(int i=0; i<arr.length; i++) {
//             for(int j=0; j<arr[0].length; j++) {
//                 if(arr[i][j]==7) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     };
// };






// Question 2 : Print out the sum of the numbers in the second row of the "nums" array.
// Example: Input - int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
// Output - 18


// public class _8_2D_Arrays_Questions {
//     public static void main(String[] args) {
//         int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
//         int sum=0;
//         for(int i=0; i<nums[1].length; i++) {
//             sum+=nums[1][i];
//         }
//         System.out.println(sum);
//     }
// }






// Question 3 : Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23

// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23


// public class _8_2D_Arrays_Questions {

//     public static void printMatrix(int[][] matrix) {
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int row = 2, column = 3;
//         int[][] matrix = {{2,3,7},{5,6,7}};
//         printMatrix(matrix);

//         int[][] transpose = new int[column][row];
        
//         for(int i=0; i<row; i++) {
//             for(int j=0; j<column; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }

//         System.out.println();

//         printMatrix(transpose);
//     }
// }