// import utils.NumberTheory;
import utils.Matrix;
public class Main {
    public static void main(String args[]){
        // NumberTheory nt=new NumberTheory();
        // nt.getPrimes(100);
        Matrix m1=new Matrix(3,3);
        Matrix m2=new Matrix(4);
        m1.display();
        m2.display();

        // m1.getCofactor(0, 0).display();

        // m1.getMul(m2).display();

        System.out.println(m1.det());
    }
}
