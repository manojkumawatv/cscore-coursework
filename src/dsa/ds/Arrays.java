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
    public String toString(){
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i+", ");
        }
        System.out.print("]");
        return "";
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        Arrays arr= new Arrays(nums);
        arr.insert(3,4);
        System.out.println(arr);
    }
}
