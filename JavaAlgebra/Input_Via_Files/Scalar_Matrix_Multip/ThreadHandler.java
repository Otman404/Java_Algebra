class ThreadHandler{

	private int nbOfThreads;
	private int r;
	private int c;
	private Thread[] th;
	private ScalarByMatrix sm;

	public ThreadHandler(int r , int c , int nbOfThreads){
		this.nbOfThreads = nbOfThreads;
		this.r  = r;
		this.c  = c;
		this.th = new Thread[nbOfThreads];
		this.sm = sm;
	}
	public void Start(Matrix m1 , int scalar , Matrix result){
		int k = 0;
		try{
			for (int i = 0 ;i<this.r;i++ ){
				for (int j = 0;j<this.c ;j++ ) {
					this.th[k] = new Thread(new ScalarByMatrix(m1,scalar,result,i,j));
					this.th[k].start();
					this.th[k].join();
					k++;
				}
			}
		}catch(Exception e){}		
	}

}