package utils;

public class Matrix {
    private int[][] arr;
    private final int rows;
    private final int cols;
    Matrix(){
        arr=new int[3][3];
        rows=3;
        cols=3;
        setValues();
    }
    public Matrix(int n){
        arr=new int[n][n]; //square matrix
        rows=n;
        cols=n;
        setValues();
    }
    Matrix(int m, int n){
        arr=new int[m][n];
        rows=m;
        cols=n;
    }
    public void setValues(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                this.arr[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public void display(){
        for(int i=0; i<cols*2; i++) System.out.print("-");
        System.out.println();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(this.arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public Matrix getMul(Matrix m2){return null;}
    public Matrix getCofactor(int r, int c) {
        Matrix ans = new Matrix(rows - 1, cols - 1);
        int m = 0, n = 0;
        for (int i = 0; i < rows; i++) {
            if (i == r) continue;
            for (int j = 0; j < cols; j++) {
                if (j != c) {
                    ans.arr[m][n] = this.arr[i][j];
                    n++;
                }
            }
            m++;
            n = 0;
        }
        return ans;
    }
    public int det(){return 0;}

}