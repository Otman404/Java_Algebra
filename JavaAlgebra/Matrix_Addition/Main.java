import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Matrix Multiplication ========");
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
		m1.setMat();
		m2.setMat();
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