import java.util.*;
 class Transpose implements Runnable{

 	private Matrix m;
 	private Matrix mt;
 	private int i;
 	private int j;
 	public Transpose(Matrix m , Matrix mt , int i , int j){
 		this.m = m;
 		this.mt = mt;
 		this.i = i;
 		this.j = j;
 	}

 	public void run(){
 		try{
 			this.mt.setValue(j,i,m.getValue(i,j));
 		}catch(Exception e){}
 	}

 }