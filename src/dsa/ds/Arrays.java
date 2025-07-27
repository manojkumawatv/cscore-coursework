package dsa.ds;
import dsa.algo.*;

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
    //bit manipulation
    public int[][] powerSet() {
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
    public static int[][] multiply(int arr1[][],int arr2[][]) {
		if (arr1[0].length != arr2.length) {
		    throw new IllegalArgumentException("Number of columns in arr1 must be equal to number of rows in arr2"); 
		}
        int m=arr1.length, n=arr2[0].length;
        int p=arr2.length;
		int[][] arr3=new int[m][n];
		for(int i=0; i<m; i++){
		    for(int j=0; j<n; j++){
		        arr3[i][j]=0;
		        for(int k=0; k<p; k++){
		            arr3[i][j]+=arr1[i][k]*arr2[k][j];
		        }
		    }
		}
		return arr3;
	}
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        Arrays arr= new Arrays(nums);
        arr.insert(3,4);
        System.out.println(arr);
        System.out.println(java.util.Arrays.toString((arr.powerSet())));
    }
}
