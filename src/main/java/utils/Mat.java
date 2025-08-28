package utils;

public class Mat {
    int[][] arr;
    Mat(){
        arr=new int[3][3];
        setValues();
    }
    public Mat(int n){
        arr=new int[n][n]; //square matrix
        setValues();
    }
    Mat(int m, int n){
        arr=new int[m][n];
    }
    public void setValues(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                this.arr[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public void display(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(this.arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
