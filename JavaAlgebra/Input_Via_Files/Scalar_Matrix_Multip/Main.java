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
		ThreadHandler th = new ThreadHandler(m.getRows(),m.getColumns(),size);		
		th.Start(m,scalar,result);		

		System.out.println("Result : ");
		result.Display();
	}
}