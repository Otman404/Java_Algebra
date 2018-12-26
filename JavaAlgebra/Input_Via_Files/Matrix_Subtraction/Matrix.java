import java.util.*;
import java.io.*;

class Matrix{

	private int c;
	private int r;
	private int[][] mat;
	private String filename;
	public Matrix(int r , int c ){
		this.r = r;
		this.c = c;
		this.mat = new int[this.r][this.c];
	}
	public Matrix(String filename){
		this.filename = filename;
		try{
		Scanner in = new Scanner(new File(filename));
		this.c = in.nextLine().replaceAll("\\s","").length();
		List<Integer> elems = new ArrayList<Integer>();
		while(in.hasNextInt()){
			elems.add(in.nextInt());
		}
		this.r = elems.size()/this.c + 1;
		this.mat = new int[this.r][this.c];
		}catch(FileNotFoundException e){System.out.println(e);}
	}
	
	//No need to define Rows/Columns setters

	public int getColumns(){return this.c;}
	public int getRows(){return this.r;}

	public int getValue(int i , int j){
		return this.mat[i][j];
	}
	public void setValue(int i , int j,int val){
		this.mat[i][j] = val;
	}

	//Matrix getter/setter
	public int [][] getMat(){return this.mat;}
	public void setMat(){
		try{
			Scanner in = new Scanner(new File(filename));
      		this.mat = new int[this.r][this.c];
      		while(in.hasNextLine()) {
         		for (int i=0; i<this.r; i++) {
     				String[] line = in.nextLine().trim().split(" ");
            		for (int j=0; j<line.length; j++) {
            			try{
               				this.mat[i][j] = Integer.parseInt(line[j]);
            			}catch(Exception e){System.out.println(e);}
            		}
         		}
      	}
		}catch(FileNotFoundException e){System.out.println(e);}
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
