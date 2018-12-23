import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Matrix Transpose ========");
		System.out.println("Matrix rows : ");
		int rows = in.nextInt();
		System.out.println("Matrix Columns : ");
		int columns = in.nextInt();
		Matrix m = new Matrix(rows,columns);
		Matrix mt = new Matrix(columns,rows);
		System.out.println("Setting the matrix : ");
		m.setMat();
		m.Display();
		int size = columns * rows;
		ThreadHandler th = new ThreadHandler(rows,columns,size);
		th.Start(m,mt);
		System.out.println("Matrix Transpose : ");
		mt.Display();
	}

}