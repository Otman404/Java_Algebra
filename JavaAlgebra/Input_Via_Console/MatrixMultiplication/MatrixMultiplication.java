class MatrixMultiplication implements Runnable{

	private Matrix m1;
	private Matrix m2;
	private Matrix result;
	private int i;
	private int j;
	public MatrixMultiplication(Matrix m1 , Matrix m2 ,Matrix result, int i , int j){
		this.m1 = m1;
		this.m2 = m2;
		this.result = result;
		this.i = i;
		this.j = j;
	}

	public Matrix getResult(){
		return this.result;
	}

	public void run(){ 
		try{

			if(m1.getColumns() != m2.getRows()){
				System.out.println("Multiplication impossible");
				return;
			}else{				
				for (int i = 0;i<this.m2.getMat().length;i++ ) {
					this.result.setValue(this.i,this.j,(m1.getValue(this.i,i)*m2.getValue(i,this.j)) + result.getValue(this.i,this.j));
				}
			}
		}catch(Exception e){}
	}
}