import java.util.*;
import java.io.*;

class Main{

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("\n\t\t\t======== Matrix Substraction ========");
		Matrix m1 = new Matrix("matrix1.txt");
		Matrix m2 = new Matrix("matrix2.txt");
		m1.setMat();
		m2.setMat();
		Matrix result = new Matrix(m1.getRows(),m1.getColumns());
		int size1 = m1.getColumns()*m1.getRows();
		int size2 = m2.getColumns()*m2.getRows();
		if(size1 != size2){
			System.out.println("The number of columns in the first matrix should be equal to the number of rows in the second.");
			return;
		}
		System.out.println("Matrix 1");
		m1.Display();
		System.out.println("Matrix 2");
		m2.Display();
		Thread[] threads = new Thread[size1];
		int k = 0;
		try{
			for (int i = 0 ;i<m1.getRows();i++ ){
				for (int j = 0;j<m2.getColumns() ;j++ ) {
					threads[k] = new Thread(new MatrixSubstraction(m1,m2,result,i,j));
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
