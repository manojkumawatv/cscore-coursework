package dsa;
import dsa.algo.*;
import dsa.ds.*;
import dsa.ds.list.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 15, 12, 5, 33, 7, 9, 11};
        // Sorting.mergeSort(arr, 0, arr.length-1);
		// System.out.println(Arrays.toString(arr));
        Sorting.quickSort(arr, 0, arr.length-1);

        // Sorting_.countingSort(arr);
        System.out.println(Arrays.toString(arr));

        // Queue q1=new Queue();
        // q1.enqueue("Manoj");
        // q1.enqueue("MKV");
        // q1.display();
        // LL list=new LL();
        // list.addAtHead(1);
        // list.addAtTail(5);
        // list.display();
        // list.addAtHead(0);
        // list.addAtIndex(2, 9);
        // list.display();

        int search=Arrays.RBinarySearch(arr, 0, arr.length-1, 11);
        // int search=Arrays.linearSearch(arr, 4);
        System.out.println(search);

        System.out.println();
        // System.out.println(new Backtrack().powerSet(new int[]{1,2,3}));
        new Backtrack().getPermutation(new int[]{1,2,3,4,5}, new ArrayList<>());
    }
}
