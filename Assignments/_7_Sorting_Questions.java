package Assignments;

//Use the following sorting algorithms to sort an array in Descending Order
//Bubble Sort
//Selection Sort
//Insertion Sort
//Counting Sort

//You can use this array as an example: [3,6,2,1,8,7,4,5,3,1]



public class _7_Sorting_Questions {

    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-2-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int max=Integer.MIN_VALUE;
            int position=0;
            for(int j=i; j<arr.length; j++) {
                if(arr[j]>max) {
                    max=arr[j];
                    position=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[position];
            arr[position] = temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //to find the index where curr is to be inserted
            while(prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max=arr[i];
            }
        }
        int freq[] = new int[max+1];
        for(int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        for(int i=max; i>=0; i--) {
            while(freq[i]!=0) {
                System.out.print(i + " ");
                freq[i]--;
            }
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        System.out.println();
        selectionSort(arr);
        insertionSort(arr);
        System.out.println();
        countingSort(arr);
    };
};