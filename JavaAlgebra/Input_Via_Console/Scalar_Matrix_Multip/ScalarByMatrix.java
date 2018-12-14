class ScalarByMatrix implements Runnable
{
  private Matrix m1;
  private Matrix m2;
  private Matrix result;
  private int scalar;
  private int i;
  private int j;
  
  public ScalarByMatrix(Matrix m1,int scalar,Matrix result, int i, int j) {
    this.m1 = m1;
    this.result = result;
    this.scalar = scalar;
    this.i = i;
    this.j = j;
  }
  
  public Matrix getResult() {
    return result;
  }
  
  public void run()
  {
    try {
      result.setValue(i, j, m1.getValue(i, j)*this.scalar);
    }
    catch (Exception e) {}
  }
}