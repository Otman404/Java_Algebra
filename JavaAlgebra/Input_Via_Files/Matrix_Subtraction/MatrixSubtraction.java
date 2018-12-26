class MatrixSubstraction implements Runnable
{
  private Matrix m1;
  private Matrix m2;
  private Matrix result;
  private int i;
  private int j;
  
  public MatrixSubstraction(Matrix m1, Matrix m2, Matrix result, int i, int j) {
    this.m1 = m1;
    this.m2 = m2;
    this.result = result;
    this.i = i;
    this.j = j;
  }
  
  public Matrix getResult() {
    return result;
  }
  
  public void run()
  {
    try {
      result.setValue(i, j, m1.getValue(i, j) - m2.getValue(i, j));
    }
    catch (Exception e) {}
  }
}