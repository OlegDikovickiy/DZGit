public class Main {
  public static void main(String[] args) {
    int[] sales = {123, 23, 345, 543, 12, 6, 2345, 1499, 1};

    SalesManager salesManager = new SalesManager(sales);

    System.out.println("Максимальное значение: " + salesManager.max());
    System.out.println("Среднее значение продаж: " + salesManager.averageValue());
  }
}
