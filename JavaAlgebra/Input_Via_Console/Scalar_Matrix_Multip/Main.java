import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Scalar_Matrix Multiplication ========");
		System.out.println("Matrix rows : ");
		int rows = in.nextInt();
		System.out.println("Matrix Columns : ");
		int columns = in.nextInt();
		Matrix m1 = new Matrix(rows,columns);
		Matrix result = new Matrix(rows,columns);
		System.out.println("Setting Matrix :");
		m1.setMat();
		System.out.println("Enter a Number : ");
		int scalar = in.nextInt();
		System.out.println("Matrix 1");
		m1.Display();
		int size = rows*columns;
		ThreadHandler th = new ThreadHandler(rows,columns,size);		
		th.Start(m1,scalar,result);
		System.out.println("Result : ");
		result.Display();
	}
}
