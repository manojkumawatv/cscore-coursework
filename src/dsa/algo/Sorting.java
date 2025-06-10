package dsa.algo;

public class Sorting extends Devide_Conquer {
    public static void swap(int[] elements, int firstIndex, int secondIndex) {
		int tmp=elements[firstIndex];
		elements[firstIndex]=elements[secondIndex];
		elements[secondIndex]=tmp;
	}
    
	public static int bubbleSort(int[] elements) {
		int n = elements.length;
        int noOfPasses=0;
		for (int i = 0; i<n-1; i++) {
			boolean swapped = false;
			noOfPasses += 1;
			for (int j = 0; j<n-i-1; j++) {
				if (elements[j] > elements[j+1]) {
					swap(elements, j, j+1);
					swapped = true;
				}
			}
			if (swapped == false)
				break; // Best case-> O(n)
		}
		return noOfPasses;
	}
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
        // append remaining elements of from eigther subArray
        while(i < leftArray.length || j < rightArray.length){
			if(i<leftArray.length){
            	arr[k++] = leftArray[i++];
			} else {
				arr[k++] = rightArray[j++];
			}
        }
    }
    public static int[] mergeSort(int[] arr, int l, int h){
        if(l<h){
        int mid = (l + h) / 2;    //Divide
        //conquer
        mergeSort(arr, l, mid); 
        mergeSort(arr, mid+1, h);
        merge(arr, l, mid, h);    //combine
        }
        return arr;
    }
    // Partition method
    public static int partition(int[] A, int p, int r) {
        int x = A[r]; // Pivot element
        int i = p - 1; // track index of smaller element why?p-1: as i update before used

        for (int j = p; j < r; j++) {
            if (A[j] < x) {
                i++;
                // Swap A[i] and A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        // Swap pivot with element at i+1 & then return
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1; // Return partition index
    }
    //QUICKSORT
    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1); // Sort left subarray
            //excluded q as now it is on right place
            quickSort(A, q + 1, r); // Sort right subarray
        }
    }
}
