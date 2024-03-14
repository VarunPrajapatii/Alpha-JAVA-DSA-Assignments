package Arrays;

public class MaxSubarraySumPrefixSum {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for(int start=0; start<arr.length; start++) {

            for(int end=start; end<arr.length; end++) {
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubarraySum(arr);
    }

}
