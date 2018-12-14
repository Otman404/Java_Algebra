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
		m.setMat();
		m.Display();
		int size = columns * rows;
		Thread[] threads = new Thread[size];
		int k = 0;
		try{
			for (int i = 0 ;i<rows;i++ ){
				for (int j = 0;j<columns ;j++ ) {
					threads[k] = new Thread(new Transpose(m,mt,i,j));
					threads[k].start();
					threads[k].join();
					k++;
				}
			}
		}catch(Exception e){}
		System.out.println("Matrix Transpose : ");
		mt.Display();
	}

}