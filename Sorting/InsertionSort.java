package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else if(arr[j]>arr[j-1]) {
                    break;
                }
            }
        }
    }

    //OR
    public static void insertionSort2(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,44,6,66,95,87,42,1,25,62,458,45,11,612,4565,15,7,558,45,122,36,2,48,79,0,65,50,960,86};
        int arr2[] = {5,8,44,6,66,95,87,42,1,25,62,458,45,11,612,4565,15,7,558,45,122,36,2,48,79,0,65,50,960,86};
        insertionSort(arr);
        insertionSort2(arr2);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
