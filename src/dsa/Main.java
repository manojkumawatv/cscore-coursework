package dsa;
import dsa.algorithms.*;
import dsa.ds.*;
import dsa.ds.Queue;
import dsa.ds.list.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={5,8,4,22,78,5,48,72};
        // Sorting.mergeSort(arr, 0, arr.length-1);
		// System.out.println(Arrays.toString(arr));
        // Sorting.quickSort(arr, 0, arr.length-1);

        // Sorting_.countingSort(arr);
        // System.out.println(Arrays.toString(arr));

        // Queue q1=new Queue();
        // q1.enqueue("Manoj");
        // q1.enqueue("MKV");
        // q1.display();
        LL list=new LL();
        list.addAtHead(1);
        list.addAtTail(5);
        list.display();

        int search=Arrays.linearSearch(arr, 22);
        System.out.println(search);
    }
}
