package dsa.algo;
public class ArraySearch {
    // O(n)
    public static int linearSearch(int[] arr, int element) {
        if (arr == null) {  // Check for edge cases
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // element found
            if (arr[i] == element) {
                return i;
            }
        }
        // Not found.
        return -1;
    }

    // O(logn) works only when arr is SORTED
    // divides
    public static int BinarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        // = is edge i.e arr=[5], l=r we are seraching even if one element
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid])
                return mid;
            if (target < arr[mid]) {
                right = mid - 1;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }
    //Tail Recursion
    public static int RBinarySearch(int[] arr, int l, int h, int target){
        int mid;
        if(l<=h) {
            mid = l + (h - l) / 2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                return RBinarySearch(arr, l, mid-1, target);
            } else {
                return RBinarySearch(arr, mid+1, h, target);
            }
        }
        return -1; //key not found
    }
    // Analysis:
    // Initial Condition: left = 0, right = length-1
    // Termination: left > right
    // Searching Left: right = mid-1
    // Searching Right: left = mid+1
}