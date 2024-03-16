package Sorting;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int freq[] = new int[max+1];
        for(int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i]>0) {
                while(freq[i]!=0) {
                    freq[i]--;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,44,6,66,95,87,42,1,25,62,458,45,11,612,4565,15,7,558,45,122,36,2,48,79,0,65,50,960,86};
        countingSort(arr);
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}
