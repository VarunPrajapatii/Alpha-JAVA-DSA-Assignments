package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int index=i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,44,6,66,95,87,42,1,25,62,458,45,11,612,4565,15,7,558,45,122,36,2,48,79,0,65,50,960,86};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
