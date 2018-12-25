import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Matrix Multiplication ========");
		
		Matrix m1 = new Matrix("matrix1.txt");
		Matrix m2 = new Matrix("matrix1.txt");

		if(m1.getColumns() != m2.getRows()){
			System.out.println("The number of columns in the first matrix should be equal to the number of rows in the second.");
			return;
		}
		Matrix result = new Matrix(m1.getRows(),m2.getColumns());
		m1.setMat();
		m2.setMat();
		System.out.println("Matrix 1");
		m1.Display();
		System.out.println("Matrix 2");
		m2.Display();
		int nbrOfCells = m1.getRows()*m2.getColumns();
		ThreadHandler th = new ThreadHandler(m1.getRows(),m2.getColumns(),nbrOfCells);
		th.Start(m1,m2,result);

		System.out.println("Result : ");
		result.Display();
	}
}
