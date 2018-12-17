import java.util.*;
import java.io.*;

class Main{

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("\n\t\t\t======== Scalar-Matrix Multiplication ========");
		Scanner in = new Scanner(System.in);
		Matrix m = new Matrix("matrix.txt");
		Matrix result = new Matrix(m.getRows(),m.getColumns());
		m.setMat();
		System.out.println("Enter a Number : ");
		int scalar = in.nextInt();
		System.out.println("Matrix : ");
		m.Display();
		int size = m.getRows()*m.getColumns();
		Thread[] threads = new Thread[size];
		int k = 0;
		try{
			for (int i = 0 ;i<m.getRows();i++ ){
				for (int j = 0;j<m.getColumns() ;j++ ) {
					threads[k] = new Thread(new ScalarByMatrix(m,scalar,result,i,j));
					threads[k].start();
					threads[k].join();
					k++;
				}
			}
		}catch(Exception e){}		

		System.out.println("Result : ");
		result.Display();
	}
}