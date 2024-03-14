package Arrays;

public class BinarySearch {
    public static int search(int arr[], int key) {
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(key == arr[mid]) {
                return mid;
            } else if(key > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int index = search(arr, 14);
        if(index == -1) {
            System.out.println("Key Not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
