public class DiagonalSum {
    // public static int diagonalSum(int matrix[][]) {  //O(n^2)  its brute force
    //     int n=matrix.length;
    //     int sum=0;
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<n; j++) {
    //             if(i==j || i+j==n-1) {
    //                 sum+=matrix[i][j];
    //             }
    //             if(n%2!=0) {
    //                 sum=sum-matrix[n/2][n/2];
    //             }
    //         }
    //     }
    //     return sum;

    // }

    public static int diagonalSum(int matrix[][]) {
        int sum =0;
        for(int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
            if(i!=matrix.length-i-1) {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
}
