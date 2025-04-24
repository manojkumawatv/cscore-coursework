package dsa.ds;
import dsa.algorithms.ArraySearch;

public class Arrays extends ArraySearch {
    int size; //capacity
    int[] arr;
    public Arrays(int size){
        this.size=size;
        arr=new int[size];
    }
    public Arrays(int[] arr){
        this.arr= new int[arr.length];
        this.arr=arr;
        this.size=arr.length;
    }
    public void insert(int index, int val){
        int i = size - 2;
        while (i >= index) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[index] = val;
    }
    public static String toString(int[] arr){
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i+", ");
        }
        System.out.print("]");
        return "";
    }
    public int[][] powerSet(int[] arr) {
        int n = arr.length;
        int powerSetSize = (int) Math.pow(2, n);
        int[][] powerSet = new int[powerSetSize][];
        for (int i = 0; i < powerSetSize; i++) {
            int setSize = Integer.bitCount(i);
            powerSet[i] = new int[setSize];
            int index = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    powerSet[i][index++] = arr[j];
                }
            }
        }
        return powerSet;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        Arrays arr= new Arrays(nums);
        arr.insert(3,4);
        System.out.println(arr);
    }
}
