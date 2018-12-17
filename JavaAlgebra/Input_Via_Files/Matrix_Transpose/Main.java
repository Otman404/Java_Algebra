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
		Thread[] threads = new Thread[size];
		int k = 0;
		try{
			for (int i = 0 ;i<m.getRows();i++ ){
				for (int j = 0;j<m.getColumns() ;j++ ) {
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