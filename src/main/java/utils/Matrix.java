package utils;

public class Matrix {
    private double[][] arr;
    private final int rows;
    private final int cols;

    Matrix() {
        arr = new double[3][3];
        rows = 3;
        cols = 3;
        setValues();
    }

    public Matrix(int n) {
        arr = new double[n][n]; // square matrix
        rows = n;
        cols = n;
        setValues();
    }

    public Matrix(int m, int n) {
        arr = new double[m][n];
        rows = m;
        cols = n;
        setValues();
    }

    public void setValues() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.arr[i][j] = Math.random() * 10;
            }
        }
    }

    public void display() {
        for (int i = 0; i < cols * 2; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // M Multiplication
    public Matrix multiply(Matrix m2) {
        // A[m*n] * B[n*p] ==> C[m*n]
        int m = this.rows;
        int n = m2.cols;
        if (this.cols != m2.rows) {
            throw new IllegalArgumentException("undefined: cols of Matrix A and rows of Matrix B should be same");
        }
        Matrix C = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m2.rows; k++) {
                    C.arr[i][j] += this.arr[i][k] * m2.arr[k][j];
                }
            }
        }

        return C;
    }
    // scalar multiply
    public Matrix multiply(int k) {
        Matrix ans = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans.arr[i][j] = k * this.arr[i][j];
            }
        }
        return ans;
    }

    // scalar multiply with scalar
    public Matrix multiply(double k) {
        Matrix ans = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans.arr[i][j] = k * this.arr[i][j];
            }
        }
        return ans;
    }

    public Matrix cofactor(int r, int c) {
        int newRows = rows - 1;
        int newCols = cols - 1;
        Matrix ans = new Matrix(newRows, newCols);
        int m = 0;
        for (int i = 0; i < rows; i++) {
            if (i == r)
                continue;
            int n = 0;
            for (int j = 0; j < cols; j++) {
                if (j == c)
                    continue;
                ans.arr[m][n] = this.arr[i][j];
                n++;
            }
            m++;
        }
        return ans;
    }

    public double det() {
        if (this.rows != this.cols) {
            throw new IllegalArgumentException("Input Matrix should be Square");
        }
        if (this.rows == 1) {
            return this.arr[0][0];
        }
        if (this.rows == 2) {
            return this.arr[0][0] * this.arr[1][1]
                    - this.arr[0][1] * this.arr[1][0];
        }

        int detMat = 0;

        // det(A) = the sum of products of elements of a row (or a column) with
        // corresponding co-factors * -1^(i+j)
        for (int j = 0; j < this.cols; j++) {
            Matrix cofactor = cofactor(0, j);
            int sign = (j % 2 == 0) ? 1 : -1;
            detMat += sign * this.arr[0][j] * cofactor.det();
        }
        return detMat;
    }

    public Matrix transpose() {
        Matrix T = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T.arr[j][i] = this.arr[i][j];
            }
        }
        return T;
    }

    public Matrix adjoint() {
        if (this.rows != this.cols) {
            throw new IllegalArgumentException("Input matrix must be square to compute Adj");
        }
        Matrix Adj = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sign = ((i + j) % 2 == 0) ? 1 : -1;
                Adj.arr[j][i] = sign * cofactor(i, j).det();
            }
        }
        return Adj;
    }

    public Matrix inverse() {
        double d=this.det();
        if(d==0){
            return null;
        }
        Matrix Inv= adjoint().multiply(1/d);
        return Inv;
    }

}