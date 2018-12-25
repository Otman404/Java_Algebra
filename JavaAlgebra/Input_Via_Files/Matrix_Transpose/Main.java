import java.util.*;

class Main{ 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Matrix Transpose ========");
		
		Matrix m = new Matrix("matrix.txt");


		Matrix mt = new Matrix(m.getColumns(),m.getRows());
		m.setMat();
		m.Display();
		int size = m.getColumns() * m.getRows();
		ThreadHandler th = new ThreadHandler(m.getRows(),m.getColumns(),size);
		th.Start(m,mt);
		System.out.println("Matrix Transpose : ");
		mt.Display();
	}

}