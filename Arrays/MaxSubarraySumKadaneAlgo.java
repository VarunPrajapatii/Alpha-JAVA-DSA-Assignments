package Arrays;

public class MaxSubarraySumKadaneAlgo {
    public static void maxSubarraySum(int arr[]) {
        int maxSum = 0;
        int currSum = 0;
        
        boolean neg = true;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                neg = false;
                break;
            }
        }
        if(neg == true) {
            maxSum = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] > maxSum) {
                    maxSum = arr[i];
                }
            }
            System.out.println("Max Subarray sum is: " + maxSum);
        } else {
            for(int i=0; i<arr.length; i++) {
                currSum = currSum+arr[i];
                if(currSum < 0) {
                    currSum = 0;
                }
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
    
            System.out.println("Max Subarray sum is: " + maxSum);
        }

    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(arr);
    }
}
