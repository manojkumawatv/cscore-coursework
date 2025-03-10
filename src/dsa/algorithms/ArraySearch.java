package dsa.algorithms;
public class ArraySearch {
    // O(n)
    public static int linearSearch(int[] arr, int element) {
        // Check for edge cases
        if (arr == null) {
            return -1;
        }
        // check
        for (int i = 0; i < arr.length; i++) {
            // element found
            if (arr[i] == element) {
                return i;
            }
        }

        //Not found.
        return -1;
    }

    //O(logn) works only when arr is SORTED
    public static int BinarySearch(int[] arr, int target) {
        int left=0, right=arr.length-1; 
        
        // = is edge i.e arr=[5], l=r
        while(left<=right){ 
            int mid=(left+right)/2;
            if(target==arr[mid]) return mid;
            if(target<arr[mid]) {
                right=mid-1;
            }
            if(target>arr[mid]){
                left=mid+1;
            }
        }
        return -1;
    }
}