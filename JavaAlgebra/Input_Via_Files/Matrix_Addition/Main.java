import java.util.*;
import java.File.*;

class Main{

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("\n\t\t\t======== Matrix Addition ========");


		if(size1 != size2){
			System.out.println("The number of columns in the first matrix should be equal to the number of rows in the second.");
			return;
		}
		Matrix m2 = new Matrix(rows2,columns2);
		Matrix result = new Matrix(rows1,columns1);
		m1.setMat("matrix1.txt");
		m2.setMat("matrix2.txt");
		int size1 = m1.getColumns()*m1.getRows();
		int size2 = m2.getColumns()*m2.getRows();
		System.out.println("Matrix 1");
		m1.Display();
		System.out.println("Matrix 2");
		m2.Display();
		Thread[] threads = new Thread[size1];
		int k = 0;
		try{
			for (int i = 0 ;i<rows1;i++ ){
				for (int j = 0;j<columns2 ;j++ ) {
					threads[k] = new Thread(new MatrixAddition(m1,m2,result,i,j));
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
