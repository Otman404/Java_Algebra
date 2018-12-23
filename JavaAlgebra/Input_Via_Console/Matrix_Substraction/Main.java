import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Matrix Substraction ========");
		System.out.println("Matrix 1 rows : ");
		int rows1 = in.nextInt();
		System.out.println("Matrix 1 Columns : ");
		int columns1 = in.nextInt();
		Matrix m1 = new Matrix(rows1,columns1);
		System.out.println("Matrix 2 rows : ");
		int rows2 = in.nextInt();
		System.out.println("Matrix 2 Columns : ");
		int columns2 = in.nextInt();
		int size1 = columns1*rows1;
		int size2 = columns2*rows2;
		if(size1 != size2){
			System.out.println("The number of columns in the first matrix should be equal to the number of rows in the second.");
			return;
		}
		Matrix m2 = new Matrix(rows2,columns2);
		Matrix result = new Matrix(rows1,columns1);
		System.out.println("Setting Matrix 1 ");
		m1.setMat();
		System.out.println("Setting Matrix 2 ");
		m2.setMat();
		System.out.println("Matrix 1");
		m1.Display();
		System.out.println("Matrix 2");
		m2.Display();
		ThreadHandler th = new ThreadHandler(rows1,columns2,size1);
		th.Start(m1,m2,result);
		System.out.println("Result : ");
		result.Display();
	}
}
