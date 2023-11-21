public class ProductWarehouseWithHistory extends ProductWarehouse { 

  private ChangeHistory historys = new ChangeHistory();

  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
    super(productName, capacity);
    super.addToWarehouse(initialBalance);
    this.historys.add(initialBalance);
  }
  
  public String history() {
    return historys.toString();
  }

  @Override
  public void addToWarehouse(double amount) {
    super.addToWarehouse(amount);
    this.historys.add(super.getBalance());
  }

  @Override
  public double takeFromWarehouse(double amount) {
    double value = super.takeFromWarehouse(amount);
    this.historys.add(super.getBalance());

    return value;
  }

  public void printAnalysis() {
    System.out.println("Product: " + super.getName());
    System.out.println("History: " + history());
    System.out.println("Largest amount of product: " + historys.maxValue());
    System.out.println("Smallest amount of product: " + historys.minValue());
    System.out.println("Average: " + historys.average());
  }
}
