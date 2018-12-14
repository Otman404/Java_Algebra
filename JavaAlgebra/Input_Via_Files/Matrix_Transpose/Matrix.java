import java.util.*;

class Matrix{

	private int c;
	private int r;
	private int[][] mat;

	public Matrix(int r , int c ){
		this.r = r;
		this.c = c;
		this.mat = new int[this.r][this.c];
	}

	//Columns getter/setter
	public int getColumns(){return this.c;}
	public void setColumns(int c){
		if(c<0){
			System.out.println("Column Numbers must be positive");
			return ;
		}
		else{
			this.c = c;
		}
	}

	//Rows getter/setter
	public int getRows(){return this.r;}
	public void setRows(int r){
		if(r<0){
			System.out.println("Row Numbers must be positive");
			return ;
		}
		else{
			this.r = r;
		}
	}
	public int getValue(int i , int j){
		return this.mat[i][j];
	}
	public void setValue(int i , int j,int val){
		this.mat[i][j] = val;
	}
	//Matrix getter/setter
	public int [][] getMat(){return this.mat;}
	public void setMat(){
		Scanner in = new Scanner(System.in);
		for (int i = 0;i<this.r ;i++ ) {
			for (int j = 0;j<this.c ;j++ ) {
				System.out.print("["+i+"]["+j+"] = ");
				mat[i][j] = in.nextInt();
				System.out.println();
			}
		}
	}

	//Display matrix
	public void Display(){
		for (int[] r : mat) {
			for(int c : r){
				System.out.format("%4d ",c);
			}
				System.out.println();
		}
	}



}