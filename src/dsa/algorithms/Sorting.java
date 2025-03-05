package dsa.algorithms;

public class Sorting extends Devide_Conquer {
	public static int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j]; //Array shifting 
                --j;
            }
            arr[j+1]=current;
        }
        return arr;
    }
}

class Devide_Conquer {
    private static void merge(int[] arr, int l, int mid, int h){
        //input Array containing sorted subarray arr[l...mid] && arr[mid+1...h]
        //merge into single sorted subarray arr[l...h]
        //n1=mid-l+1
        //n2=h-mid
        int[] leftArray = new int[mid - l + 1];
        int[] rightArray = new int[h - mid];
        
         //Copy arr to L & R
        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = arr[l + i];
        }
        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = arr[mid + 1 + i];
        }

        // Merge Two SortedArrays into single SortedArray
        int i = 0, j = 0, k = l;
        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        // Copy remaining elements of leftArray, if any
        while(i < leftArray.length){
            arr[k++] = leftArray[i++];
        }
        while(j < rightArray.length){
            arr[k++] = rightArray[j++];
        }
    }
    public static int[] mergeSort(int[] arr, int l, int h){
        if(l >= h){
            return arr; // Base Case
        }
        int mid = (l + h) / 2;
        mergeSort(arr, l, mid);   //conquer
        mergeSort(arr, mid+1, h); //conquer
        merge(arr, l, mid, h);
        return arr;
    }
    // Partition function
    public static int partition(int[] A, int p, int r) {
        int x = A[r]; // Pivot element
        int i = p - 1; // Index of smaller element

        for (int j = p; j < r; j++) {
            if (A[j] < x) {
                i++;
                // Swap A[i] and A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        // Swap pivot with element at i+1
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1; // Return partition index
    }
    // Quicksort function
    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1); // Sort left subarray
            quickSort(A, q + 1, r); // Sort right subarray
        }
    }
}