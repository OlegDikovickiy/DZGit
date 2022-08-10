public class Main {
  public static void main(String[] args) {
    long[] sales = {123, 23, 345, 543, 12, 6, 2345, 1499, 1};

    SalesManager salesManager = new SalesManager(sales);

    System.out.println("Максимальное значение: " + salesManager.max());
  }
}
