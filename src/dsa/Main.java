package dsa;
import java.util.Arrays;
import dsa.algorithms.Sorting;

public class Main {
    public static void main(String[] args) {
        int[] arr={5,8,4,22,78,5,48,72};
        // Sorting.mergeSort(arr, 0, arr.length-1);
        Sorting.mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
