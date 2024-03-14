package Arrays;

public class PrintSubArray {
    //Subarrays: A continous part of array
    public static void printSubArray(int arr[]) {
        int total = 0;
        for(int start=0; start<arr.length; start++) {
            for(int end=start; end<arr.length; end++) {
                for(int k=start; k<=end; k++) {
                    System.out.print(arr[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + total);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }
}
