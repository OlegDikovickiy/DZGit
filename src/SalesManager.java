public class SalesManager {
  protected long[] sales;

  public SalesManager(long[] sales) {
    this.sales = sales;
  }

  public long max() {
    long max = -1;
    for (long sale : sales) {
      if (sale > max) {
        max = sale;
      }
    }
    return max;
  }

  public int min() {
    int min = max();
    for (int sale : sales) {
      if (sale < min) {
        min = sale;
      }
    }
    return min;
  }

  public int averageValue() {
    int sum = 0;
    for (int sale : sales) {
      sum += sale;
    }
    int res = (sum - max() - min()) / (sales.length - 2);
    return res;
  }

}
