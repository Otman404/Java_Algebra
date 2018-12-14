import java.util.*;
import java.File.*;

class Main{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in1 = new Scanner(new File("matrix1.txt"));
		Scanner in2 = new Scanner(new File("matrix2.txt"));
		int columns1 = in.nextLine().replaceAll("\\s","").length();
		int columns2 = in.nextLine().replaceAll("\\s","").length();
		System.out.println("\n\t\t\t======== Matrix Addition ========");
		List<String> c = new ArrayList<String>();
		while(in1.hasNext()){
			c.add(in1.next());
		}
		int rows1 = c.size()/columns1;
		Matrix m1 = new Matrix(rows1,columns1);
		List<String> c = new ArrayList<String>();
		while(in2.hasNext()){
			c.add(in2.next());
		}
		int rows2 = c.size()/columns2;

		int size1 = columns1*rows1;
		int size2 = columns2*rows2;
		if(size1 != size2){
			System.out.println("The number of columns in the first matrix should be equal to the number of rows in the second.");
			return;
		}
		Matrix m2 = new Matrix(rows2,columns2);
		Matrix result = new Matrix(rows1,columns1);
		m1.setMat(); //Redefine setMat()
		m2.setMat(); //Redefine setMat()
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
