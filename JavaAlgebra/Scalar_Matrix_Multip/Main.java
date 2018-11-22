import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t\t\t======== Matrix Multiplication ========");
		System.out.println("Matrix rows : ");
		int rows = in.nextInt();
		System.out.println("Matrix Columns : ");
		int columns = in.nextInt();
		Matrix m1 = new Matrix(rows,columns);
		Matrix result = new Matrix(rows,columns);
		m1.setMat();
		System.out.println("Enter a Number : ");
		int scalar = in.nextInt();
		System.out.println("Matrix 1");
		m1.Display();
		int size = rows*columns;
		Thread[] threads = new Thread[size];
		int k = 0;
		try{
			for (int i = 0 ;i<rows;i++ ){
				for (int j = 0;j<columns ;j++ ) {
					threads[k] = new Thread(new ScalarByMatrix(m1,scalar,result,i,j));
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