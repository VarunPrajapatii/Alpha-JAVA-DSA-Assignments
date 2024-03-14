package Arrays;

public class MaxSubarraySum {
    public static void printSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int start=0; start<arr.length; start++) {
            for(int end=start; end<arr.length; end++) {
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    currSum += arr[k];
                }
                System.out.println("CurrSum: " + currSum);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum of Subarrays: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        printSubArray(arr);
    }
}
